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
public class Client extends AClient{
    public String name = "";
    public String lastName = "";
    public int phoneNumber;
    public String eMail = "";

    public Client(DataBase database) {
        super(database);
    }

    @Override
    public DataBase create() throws Exception{
        if(!this.validate()){
            this.database.clients.add(this);
        }else
            throw new Exception("The Client already exists for this branch");
        return this.database;
    }

    @Override
    public void read() throws Exception{
        try{
            for(Client row : this.database.clients){
                Io.escribir("IdCompany: " + row.idCompany + 
                        ", idClient: " + row.idClient +
                        ", Name: "+ row.name+
                        ", Last Name: "+ row.lastName+
                        ", Phone Number: "+ row.phoneNumber+
                        ", eMail: "+ row.eMail);
            }
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void read(ACompany element) throws Exception{
        boolean founded = false;
        if(element instanceof Client){
            for(Client row : this.database.clients){
                if(((Client)element).idCompany == row.idCompany &&
                        ((Client)element).idClient == row.idClient){
                    Io.escribir("IdCompany: " + row.idCompany + 
                        ", idClient: " + row.idClient +
                        ", Name: "+ row.name+
                        ", Last Name: "+ row.lastName+
                        ", Phone Number: "+ row.phoneNumber+
                        ", eMail: "+ row.eMail);
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
            for(Client row : this.database.clients){
                if(row.idCompany == this.idCompany &&
                        row.idClient == this.idClient){
                    row = this;
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The client doesn't exists");
        return this.database;
    }

    @Override
    public DataBase delete() throws Exception{
        boolean founded = false;
        if(this.validate()){
            for(Client row : this.database.clients){
                if(row.idCompany == this.idCompany &&
                        row.idClient == this.idClient){
                    this.database.clients.remove(this);
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The client doesn't exists");
        return this.database;
    }

    @Override
    protected boolean validate() {
        for(Client row : this.database.clients){
            if(row.idCompany == this.idCompany &&
                    row.idClient == this.idClient)
                return true;
        }
        return false;
    }
    
}
