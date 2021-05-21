/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw03;



import java.util.ArrayList;

/**
 *
 * @author jonl5
 */
public class Customer {

    //Variable Land
    private String lastName;
    private String firstName;
    private Address addy;
    private ArrayList<Account> acct = new ArrayList<Account>();
    public final double residentialUnitRate = 0.14;
    public final double commercialUnitRate = 0.125;
    //construction zone
    public Customer(String ln, String fn, Address adrs) {
        lastName = ln;
        firstName = fn;
        addy = adrs;
    }

    //Methodical madness
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getMailingAddress() {
        return addy;
    }
    //array based method with iterations

    public Account[] getAccounts() {
        Account[] money = new Account[acct.size()];
        return acct.toArray(money);
    }

    public boolean addAccount(Account a){
        return acct.add(a);
    }
    public boolean removeAccount(Account a){
        if(a != null){
           return acct.remove(a);   
        }else{
            return false;
        }
    }
}
