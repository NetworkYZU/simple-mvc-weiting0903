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
    private static HashMap customers;
    static {
        customers =new HashMap();
        customers.put("id001",new BankCustomer("id001","John","Hacker",-3456.78));
        customers.put("id002",new BankCustomer("id002","Jane","Hacker",1234.56));
        customers.put("id003",new BankCustomer("id003","Juan","Hacker",987654.32));
    }
    
    public static BankCustomer getCustomer(String id){
        return (BankCustomer)customers.get(id);
    }
}
