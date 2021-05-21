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
public class PollMeter extends Meter {
private String type;
    public PollMeter(String ID, String b, String t) {
        super(ID, b);
        type=t;
    }

    @Override
    public String getType() {
        return "poll";
    }
    
}
