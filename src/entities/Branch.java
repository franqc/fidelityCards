/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import database.DataBase;
import java.util.List;
import util.Io;

/**
 *
 * @author Jheron Chacon
 */
public class Branch extends ABranch{
    public String state = "";
    public String city = "";
    public String town = "";
    public String street = "";

    public Branch(DataBase database) {
        super(database);
    }

    @Override
    protected boolean validate() {
        for(Branch branch : this.database.branches){
            if(branch.idCompany == this.idCompany &&
                    branch.idBranch == this.idBranch)
                return true;
        }
        return false;
    }

    @Override
    public DataBase create() throws Exception {
        if(!this.validate()){
            this.database.branches.add(this);
        }else
            throw new Exception("The branch already exists");
        return this.database;
    }

    @Override
    public void read() throws Exception {
        try{
            for(Branch row : this.database.branches){
                Io.write("CompanyId: " + row.idCompany + 
                        ", BranchId: " + row.idBranch + 
                        ", State: " + row.state +
                        ", City: " + row.city +
                        ", Town: " + row.town +
                        ", Street: "+ row.street);
            }
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void read(ACompany element) throws Exception {
        boolean founded = false;
        if(element instanceof Branch){
            for(Branch row : this.database.branches){
                if(((Branch)element).idCompany == row.idCompany &&
                    ((Branch)element).idBranch == row.idBranch){
                    Io.write("CompanyId: " + row.idCompany + 
                        ", BranchId: " + row.idBranch + 
                        ", State: " + row.state +
                        ", City: " + row.city +
                        ", Town: " + row.town +
                        ", Street: "+ row.street);
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The elemnt doesn't exists in the database");
        }
        else
            throw new Exception("The element that you are looking for isnt a Company Element!");
    }

    @Override
    public DataBase update() throws Exception {
        boolean founded = false;
        if(this.validate()){
            for(Branch row : this.database.branches){
                if(row.idCompany == this.idCompany &&
                        row.idBranch == this.idBranch){
                    row = this;
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The branch doesn't exists");
        return this.database;
    }

    @Override
    public DataBase delete() throws Exception {
        boolean founded = false;
        if(this.validate()){
            for(Branch row : this.database.branches){
                if(row.idCompany == this.idCompany){
                    this.database.branches.remove(this);
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The branch doesn't exists");
        return this.database;
    }
    
}
