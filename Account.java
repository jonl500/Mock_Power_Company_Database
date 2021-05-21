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
public abstract class Account {
   //Variable land
    private String acctNum;
    private Customer person;
    private double balance=0;
    private ArrayList <Address> ad = new ArrayList<Address>();
    //put the constants make them public as they're final
    //Construction zone
    public Account(String n, Customer c){
        acctNum = n;
        person = c;
       
    }
    
    
    //method city
    public String getAccountNumber(){
        return acctNum;
    }
    public Customer getCustomer(){
        return person;
    }
    public double getCurrentBalance(){
        return balance;
    }
    public void setBalance(double b){
        balance = b;
    }
    public Address[] getAddresses(){
    Address[] addy = new Address[ad.size()];
    return ad.toArray(addy);
    }
    public boolean addAddress(Address a){
        return ad.add(a);
    }
    public boolean removeAddress(Address a){
       if(a != null){
                return ad.remove(a);
       
    }else{
        return false;   
       }
    }
    //abs method
    public abstract void updateBalance();
}
    

