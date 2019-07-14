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
public abstract class ABranch extends ACompany{
    protected int idBranch;

    public ABranch(DataBase database) {
        super(database);
    }
}
