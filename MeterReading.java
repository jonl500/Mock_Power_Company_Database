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


import java.time.LocalDateTime;
public class MeterReading {
    //Variable Land
   private double reading;
   private String flag;
   private Meter m;
    private LocalDateTime readDate;
   
   //Construction Zone
   public MeterReading(double r,LocalDateTime dt , String f, Meter mt){
    reading = r; 
    readDate = dt;
    flag = f;
    m = mt;
   
   }
   
   //Methodical zone
    public double getReading(){
        return reading;
    }
    public LocalDateTime getDateTime(){
        return readDate;
    }
    public String getFlag(){
        return flag;
    }
    public Meter getMeter(){
        return m;
    }
}
