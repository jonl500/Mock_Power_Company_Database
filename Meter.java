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
public abstract class Meter {
    //Variable land
    private String id;
    private ArrayList <MeterReading> read = new ArrayList<MeterReading>();
    private String brand;
    
    private String location;
    private Address addy;
    
    //construction zone
    public Meter(String ID, String b){
        id = ID;
        brand=b;
        
    }
    
    //method city
    public String getID(){
    return id;
    }
    public MeterReading[] getReadings(){
    MeterReading[] mr = new MeterReading[read.size()];
    return read.toArray(mr);
    }
    public MeterReading getCurrentReading(){
        if(!read.isEmpty()){
        return read.get(read.size()-1);
    }else{
            return null;
        }
       }
    public void addReading(MeterReading m){
        read.add(m);
    }
    public String getBrand(){
        return brand;
    }
    public abstract String getType();
       
    
    public String getLocation(){
        return location;
    }
    public Address getAddress(){
    return addy;
    }
    public void setLocation(Address a, String n){
        addy = a;
        location = n;
    }
}
