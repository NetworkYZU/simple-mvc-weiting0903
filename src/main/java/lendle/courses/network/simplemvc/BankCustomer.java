/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.simplemvc;

import java.util.HashMap;
import java.util.Map;

/**Bean to represent a bank customer.
 *
 * @author weiting
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public double getBalance() {
        return balance;
    }

    public double getBalanceNoSign() {
        return Math.abs(balance);
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
//Make a small table of banking customer.
    private static Map<String, BankCustomer> db=new HashMap<>();
    static {
        db.put("customer1",new BankCustomer("customer1","name1","name1",10000));
        db.put("customer2",new BankCustomer("customer2","name2","name2",15000));
        db.put("customer3",new BankCustomer("customer3","name3","name3",-1));
        db.put("customer4",new BankCustomer("customer4","name4","name4",8000));
    }
    
    public static BankCustomer getCustomer(String id){
        return db.get(id);
    }
}
