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


import java.io.File;
    import java.time.LocalDateTime;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class Main{
    public static void main(String[] args) {
    
        
 SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            TheHandler handler = new TheHandler();
            //saxParser.parse(new File("../../build.xml"), handler);
            File input = new File("data.xml");
            saxParser.parse(input, handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

