/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import entities.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jheron Chacon
 */
public class DataBase {
    public List<Company> companies = new ArrayList<Company>();
    public List<Branch> branches = new ArrayList<Branch>();
    public List<Phone> phones = new ArrayList<Phone>();
    public List<Client> clients = new ArrayList<Client>();
    public List<Price> prices = new ArrayList<Price>();
    public List<FidelityCard> cards = new ArrayList<FidelityCard>();
    public List<Times> times = new ArrayList<Times>();
    public String databaseName;
    public DataBase(String databasename){this.databaseName = databasename;}
    
}
