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
public class Phone extends ABranch{
    public int phoneNumber;
    public String phoneName = "";

    public Phone(DataBase database) {
        super(database);
    }

    @Override
    public DataBase create() throws Exception{
        if(!this.validate()){
            this.database.phones.add(this);
        }else
            throw new Exception("The phone number already exists");
        return this.database;
    }

    @Override
    public void read() throws Exception{
        try{
            for(Phone row : this.database.phones){
                Io.escribir("IdCompany: " + row.idCompany + 
                        ", idBranch: " + row.idBranch +
                        ", PhoneNumber: "+ row.phoneNumber+
                        ", Description: "+ row.phoneName);
            }
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void read(ACompany element) throws Exception{
        boolean founded = false;
        if(element instanceof Phone){
            for(Phone row : this.database.phones){
                if(((Phone)element).idCompany == row.idCompany &&
                        ((Phone)element).idBranch == row.idBranch){
                    Io.escribir("IdCompany: " + row.idCompany + 
                        ", idBranch: " + row.idBranch +
                        ", PhoneNumber: "+ row.phoneNumber+
                        ", Description: "+ row.phoneName);
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
            for(Phone row : this.database.phones){
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
            throw new Exception("The phone number doesn't exists");
        return this.database;
    }

    @Override
    public DataBase delete() throws Exception{
        boolean founded = false;
        if(this.validate()){
            for(Phone row : this.database.phones){
                if(row.idCompany == this.idCompany &&
                        row.idBranch == this.idBranch){
                    this.database.phones.remove(this);
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The Phone number doesn't exists");
        return this.database;
    }

    @Override
    protected boolean validate() {
        for(Phone row : this.database.phones){
            if(row.idCompany == this.idCompany &&
                    row.idBranch == this.idBranch)
                return true;
        }
        return false;
    }
    
}
