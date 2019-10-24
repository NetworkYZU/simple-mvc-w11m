/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.simplemvc;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lendle
 */
public class BankCustomer {

    private String id, firstName, lastName;
    private double balance;

    public BankCustomer(String id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    private static Map<String, BankCustomer> db=new HashMap<>();
    static{
        db.put("customer1", new BankCustomer("customer1", "name1", "name1", 10000));
        db.put("customer2", new BankCustomer("customer2", "name2", "name2", 15000));
        db.put("customer3", new BankCustomer("customer3", "pei3", "liu", -1));
        db.put("customer4", new BankCustomer("customer4", "name4", "name4", 8000));
    }
    
    public static BankCustomer getCustomer(String id){
        return db.get(id);
    }
}
