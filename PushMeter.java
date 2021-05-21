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
public class PushMeter extends Meter {
private String type;
private int interval;
    public PushMeter(String ID, String b, String t) {
        super(ID, b);
        type = t; //might need to be taken out and replaced with "push" in method.(same for poll)
    
    }

    @Override
    public String getType() {
   return "push";
    }
    public int getInterval(){
        return interval;
    }
    public void setInterval(int s){
        interval = s;
    }
    
    
}
