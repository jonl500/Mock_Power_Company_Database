/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw03;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author jonl5
 */
public class TheHandler extends DefaultHandler{
    
    
    
    @Override
     public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        if(qName.equalsIgnoreCase("Customer")){
          String c = attributes.getValue("lastName","firstName");
            System.out.println(c);
        }
        
    }
}
