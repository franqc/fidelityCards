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
public class Times extends ABranch{
    public int idHorario;
    private String day = "";
    private int open, close;

    public Times(DataBase database) {
        super(database);
    }
    
    public void setDay(Day day){ this.day = day.name(); }
    
    public String getDay(){return this.day;}
    
    public void setOpenTime(int opening) throws Exception{
        if(opening < 0 && opening > 23)
            throw new Exception("Time out of the permited limits!");
        this.open = opening;
    }
    
    public void setCloseTime(int closing) throws Exception{
        if(closing < 0 && closing > 23)
            throw new Exception("Time out of the permited limits!");
        this.close = closing;
    }
    
    public int getOpenTime(){return this.open;}
    
    public int getCloseTime(){return this.close;}

    @Override
    public DataBase create() throws Exception{
        if(!this.validate()){
            this.database.times.add(this);
        }else
            throw new Exception("The time already exists for this branch");
        return this.database;
    }

    @Override
    public void read() throws Exception{
        try{
            for(Times row : this.database.times){
                Io.write("IdCompany: " + row.idCompany + 
                        ", idBranch: " + row.idBranch +
                        ", idTime: "+ row.idHorario+
                        ", Day of the week: "+ row.day+
                        ", Open from: "+ row.open+
                        ", To: "+ row.close);
            }
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void read(ACompany element) throws Exception{
        boolean founded = false;
        if(element instanceof Phone){
            for(Times row : this.database.times){
                if(((Times)element).idCompany == row.idCompany &&
                        ((Times)element).idBranch == row.idBranch &&
                        ((Times)element).idHorario == row.idHorario){
                    Io.write("IdCompany: " + row.idCompany + 
                        ", idBranch: " + row.idBranch +
                        ", idTime: "+ row.idHorario+
                        ", Day of the week: "+ row.day+
                        ", Open from: "+ row.open+
                        ", To: "+ row.close);
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
            for(Times row : this.database.times){
                if(row.idCompany == this.idCompany &&
                        row.idBranch == this.idBranch &&
                        row.idHorario == this.idHorario){
                    row = this;
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The time doesn't exists");
        return this.database;
    }

    @Override
    public DataBase delete() throws Exception{
        boolean founded = false;
        if(this.validate()){
            for(Times row : this.database.times){
                if(row.idCompany == this.idCompany &&
                        row.idBranch == this.idBranch &&
                        row.idHorario == this.idHorario){
                    this.database.times.remove(this);
                    founded = true;
                    break;
                }
            }
            if(!founded)
                throw new Exception("The element that you are looking doesnt exists in the database");
        }else
            throw new Exception("The time doesn't exists");
        return this.database;
    }

    @Override
    protected boolean validate() {
        for(Times row : this.database.times){
            if(row.idCompany == this.idCompany &&
                    row.idBranch == this.idBranch &&
                    row.idHorario == this.idHorario)
                return true;
        }
        return false;
    }
    
    
}
