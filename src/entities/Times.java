/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import database.DataBase;
import java.util.List;

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
    protected boolean validate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DataBase create() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void read(ACompany element) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DataBase update() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DataBase delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
