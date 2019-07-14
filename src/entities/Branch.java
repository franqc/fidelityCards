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
