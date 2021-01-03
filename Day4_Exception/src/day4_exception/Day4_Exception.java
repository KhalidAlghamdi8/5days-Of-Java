/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_exception;

import java.util.Date;

/**
 *
 * @author dev
 */
public class Day4_Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try {
            
          int x=3;
          int y=0;
        
          System.out.println(x/y);
     
            
        } catch (Exception e) {
              System.out.println(e.getMessage());
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(new Date());
        }
    }
    
}
