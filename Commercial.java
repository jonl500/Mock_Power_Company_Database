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
public class Commercial extends Address{
private String type;
    public Commercial(String st, int hn, String zp, String tp) {
        super(st, hn, zp);
        type = tp;
    }

    @Override
    public String getType() {
        return "commercial";
    }
    
}
