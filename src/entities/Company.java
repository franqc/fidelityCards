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
public class Company extends ACompany{
    public String name = "";
    public String webPage = "";

    public Company(DataBase database) {
        super(database);
    }

    @Override
    public DataBase create() throws Exception{
        if(!this.validate()){
            this.database.companies.add(this);
        }else
            throw new Exception("The company already exists");
        return this.database;
    }

    @Override
    public void read() throws Exception{
        try{
            for(Company row : this.database.companies){
                Io.write("Id: " + row.idCompany + 
                        ", Name: " + row.name +
                        ", WebPage: "+ row.webPage);
            }
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void read(ACompany element) throws Exception{
        boolean founded = false;
        if(element instanceof Company){
            for(Company row : this.database.companies){
                if(((Company)element).idCompany == row.idCompany){
                    Io.write("Id: " + row.idCompany + 
                            ", Name: " + row.name +
                            ", WebPage: "+ row.webPage);
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
    public DataBase update() throws Exception{
        boolean founded = false;
        if(this.validate()){
            for(Company row : this.database.companies){
                if(row.idCompany == this.idCompany){
                    row = this;
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The company doesn't exists");
        return this.database;
    }

    @Override
    public DataBase delete() throws Exception{
        boolean founded = false;
        if(this.validate()){
            for(Company row : this.database.companies){
                if(row.idCompany == this.idCompany){
                    this.database.companies.remove(this);
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The company doesn't exists");
        return this.database;
    }

    @Override
    protected boolean validate() {
        for(Company company : this.database.companies){
            if(company.idCompany == this.idCompany)
                return true;
        }
        return false;
    }

}
