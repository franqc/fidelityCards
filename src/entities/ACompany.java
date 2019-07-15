/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import database.DataBase;
/**
 *
 * @author Jheron Chacon
 */
public abstract class ACompany implements Crudable{
    protected DataBase database;
    protected int idCompany;
    protected abstract boolean validate();
    public ACompany(DataBase database){
        this.database = new DataBase("");
        this.database = database;
    }
}
