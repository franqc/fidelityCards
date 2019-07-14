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
public class FidelityCard extends AClient{
    public int idCard;
    public int idPrice;
    public int marks;

    public FidelityCard(DataBase database) {
        super(database);
    }

    @Override
    public DataBase create() throws Exception{
        if(!this.validate()){
            this.database.cards.add(this);
        }else
            throw new Exception("The Card already exists for this branch");
        return this.database;
    }

    @Override
    public void read() throws Exception{
        try{
            for(FidelityCard row : this.database.cards){
                Io.write("IdCompany: " + row.idCompany + 
                        ", idClient: " + row.idClient +
                        ", idCard: "+ row.idCard+
                        ", idPrice: "+ row.idPrice+
                        ", Marks in the card: "+ row.marks);
            }
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void read(ACompany element) throws Exception{
        boolean founded = false;
        if(element instanceof FidelityCard){
            for(FidelityCard row : this.database.cards){
                if(((FidelityCard)element).idCompany == row.idCompany &&
                        ((FidelityCard)element).idClient == row.idClient &&
                        ((FidelityCard)element).idCard == row.idCard){
                    Io.write("IdCompany: " + row.idCompany + 
                        ", idClient: " + row.idClient +
                        ", idCard: "+ row.idCard+
                        ", idPrice: "+ row.idPrice+
                        ", Marks in the card: "+ row.marks);
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
            for(FidelityCard row : this.database.cards){
                if(row.idCompany == this.idCompany &&
                        row.idClient == this.idClient &&
                        row.idCard == this.idCard){
                    row = this;
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The card doesn't exists");
        return this.database;
    }

    @Override
    public DataBase delete() throws Exception{
        boolean founded = false;
        if(this.validate()){
            for(FidelityCard row : this.database.cards){
                if(row.idCompany == this.idCompany &&
                        row.idClient == this.idClient &&
                        row.idCard == this.idCard){
                    this.database.cards.remove(this);
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The card doesn't exists");
        return this.database;
    }

    @Override
    protected boolean validate() {
        for(FidelityCard row : this.database.cards){
            if(row.idCompany == this.idCompany &&
                    row.idClient == this.idClient &&
                    row.idCard == this.idCard)
                return true;
        }
        return false;
    }
    
}
