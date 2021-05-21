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
public class CommercialAccount extends Account implements Constants{
    
    public CommercialAccount(String n, Customer c) {
        super(n, c);
    }

    @Override
    public void updateBalance() {
       double sum = 0;
        for(Address a: getAddresses()){
            for(Meter m: a.getMeters()){
                for(MeterReading mr : m.getReadings()){
                   sum += mr.getReading();
                }
            }
        }
        setBalance(sum * Constants.commercialUnitRate);
    }
    
}
