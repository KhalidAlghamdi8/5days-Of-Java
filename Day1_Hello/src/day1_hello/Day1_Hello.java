/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_hello;

import java.util.Date;

/**
 *
 * @author dev
 */ 
public class Day1_Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // byte-> short->int ->long->float ->double
        byte b=18;
        
        int y=b;
        
        
        float x=3.14f;
        
        int n=(int)x;
        
        System.out.println(n);
   
       
    
       int[] age=new int[5];
       
       age[0]=21;
       age[1]=25;
       age[2]=30;
       
//******************************//


    int[] age2={22,31,25,30,12,26,23,29,24};
    
        System.out.println(age2.length);
    
    
        for (int i = 0; i < age2.length; i++) {
            
            System.out.println(age2[i]);
        }
        
        
        System.out.println("Program has been finished!");
    
    }
    
}
