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
public class Price extends ACompany{
    
    public int idPrice;
    public int marks;
    public String name = "";

    public Price(DataBase database) {
        super(database);
    }

    @Override
    public DataBase create() throws Exception{
        if(!this.validate()){
            this.database.prices.add(this);
        }else
            throw new Exception("The Price already exists for this branch");
        return this.database;
    }

    @Override
    public void read() throws Exception{
        try{
            for(Price row : this.database.prices){
                Io.escribir("IdCompany: " + row.idCompany + 
                        ", idPrice: " + row.idPrice +
                        ", Marks needed: "+ row.marks+
                        ", Price Name: "+ row.name);
            }
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void read(ACompany element) throws Exception{
        boolean founded = false;
        if(element instanceof Price){
            for(Price row : this.database.prices){
                if(((Price)element).idCompany == row.idCompany &&
                        ((Price)element).idPrice == row.idPrice){
                    Io.escribir("IdCompany: " + row.idCompany + 
                        ", idPrice: " + row.idPrice +
                        ", Marks needed: "+ row.marks+
                        ", Price Name: "+ row.name);
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
            for(Price row : this.database.prices){
                if(row.idCompany == this.idCompany &&
                        row.idPrice == this.idPrice){
                    row = this;
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The price doesn't exists");
        return this.database;
    }

    @Override
    public DataBase delete() throws Exception{
        boolean founded = false;
        if(this.validate()){
            for(Price row : this.database.prices){
                if(row.idCompany == this.idCompany &&
                        row.idPrice == this.idPrice){
                    this.database.prices.remove(this);
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The price doesn't exists");
        return this.database;
    }

    @Override
    protected boolean validate() {
        for(Price row : this.database.prices){
            if(row.idCompany == this.idCompany &&
                    row.idPrice == this.idPrice)
                return true;
        }
        return false;
    }
    
}
