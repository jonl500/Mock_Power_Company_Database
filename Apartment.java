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
public class  Apartment extends Address {
private String type;
private String unit;
    public Apartment(String st, int hn, String zp, String tp, String unt) {
        super(st, hn, zp);
        type = tp;
        unit = unt;
        
    }

    @Override
    public String getType() {
       return "apartment";
    }
    //add getter and setter
    public void setUnit(String u){
        unit = u;
    }
    public String getUnit(){
    return unit;
}
    
}
