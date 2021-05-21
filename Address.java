/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw03;

/**
 *
 * @author jonl5
 */


import java.util.ArrayList;

public abstract class Address {

    //Variable Land
    private String street;
    private int houseNum;
    private String zip;
    
    //set up meter array (might later be a list) in var land
    private ArrayList<Meter> m = new ArrayList<Meter>();
    private Account acct;
    
    //construction zone
    public Address(String st, int hn, String zp) {
        street = st;
        houseNum = hn;
        zip = zp;
    }

    //Method city
    public String getStreet(){
        return street;
    }
    public int getNumber(){
        return houseNum;
    }
    public String getZipCode(){
        return zip;
    }
    public abstract String getType();
        
    public Meter[] getMeters(){
        //returns the meter array
         Meter[] meters = new Meter[m.size()];
    return m.toArray(meters);
    }
    public boolean addMeter(Meter mt){
        return m.add(mt);
    }
    //remove meter(arraylist methods)
    public boolean removeMeter(String id){
        for(Meter mt : m){
            if(mt.getID().equals(id)){
                return m.remove(mt);
            }
        }
        return false;
    }
    public Account getAccount(){
        return acct;
    }
    
    public void setAccount(Account a){
        acct = a;
    }
    
    
}
