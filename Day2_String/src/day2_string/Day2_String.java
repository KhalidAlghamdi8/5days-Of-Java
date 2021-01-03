/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_string;

/**
 *
 * @author dev
 */
public class Day2_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // immutable
        
        String s1="Khaled";
        
        s1=s1.toUpperCase();
        
        
        System.out.println(s1);
       s1= s1.concat(" Hosni");
        System.out.println(s1);
        
        
        String s2=s1.substring(0,6);
        
        System.out.println(s2);
        
        int index= s1.indexOf("o");
        System.out.println(index); 
        
        System.out.println(s1.contains("ho"));
        
        
        System.out.println(s1.equalsIgnoreCase("Khaled Hosni"));
        
        int x= s1.compareToIgnoreCase("Ahmed Hosni");
        System.out.println(x);
        
        
        
        
    }
    
}
