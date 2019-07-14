/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.ACompany;
import util.Io;

/**
 *
 * @author Jheron Chacon
 */
public abstract class Controller {
    protected int option = 5;
    protected ACompany entity;
    public Controller(ACompany entity){
        this.entity = entity;
    }
    public void menu(){
        while(this.option > 0){
            Io.write("Welcome to the " + this.entity.getClass().getCanonicalName() + " Controller");
            Io.write("1. to add a new registry");
            Io.write("2. to update an existing registry");
            Io.write("3. to delete an existing registry");
            Io.write("4. to report all the registries");
            Io.write("0. for EXIT!");
            this.option = Io.readInteger();
            if(this.option < 0 && this.option > 4)
                Io.write("Wrong menu selection, please try again");
            switch(this.option){
                case 1:
                    this.menuAdd();
                    break;
                case 2:
                    this.menuUpdate();
                    break;
                case 3:
                    this.menuDelete();
                    break;
                case 4:
                    this.menuReport();
                    break;
                default:
                    break;
            }
        }
    }

    protected abstract void menuAdd();

    protected abstract void menuUpdate();

    protected abstract void menuDelete();

    protected abstract void menuReport();
}
