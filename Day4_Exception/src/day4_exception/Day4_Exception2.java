/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_exception;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Day4_Exception2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
             
            
            
        try {
            
            URL u=new URL("http://google.com");
            FileWriter fw=new FileWriter("newfile.txt");
            
            //..
            //
            
            
            Class.forName("");
            
        } catch (IOException ex) {
            
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
        
        }
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println(new Date());
        }
    }
    
    
    
    
}
