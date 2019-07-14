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
public abstract class AClient extends ACompany{
    protected int idClient;

    public AClient(DataBase database) {
        super(database);
    }
}
