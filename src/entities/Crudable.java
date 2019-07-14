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
public interface Crudable {
    public abstract DataBase create() throws Exception;
    public abstract void read() throws Exception;
    public abstract void read(ACompany element) throws Exception;
    public abstract DataBase update() throws Exception;
    public abstract DataBase delete() throws Exception;
}
