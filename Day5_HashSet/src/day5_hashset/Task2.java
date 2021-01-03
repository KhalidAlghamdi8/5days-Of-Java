/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_hashset;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author dev
 */
public class Task2 {
    
    public static void main(String[] args) {
        HashSet<Date> s1=new HashSet<>();
        
        s1.add(new Date(1999, 1, 2));
        s1.add(new Date(1999, 1, 2));
        
        
        System.out.println(s1);
        
        HashSet<Student> s2=new HashSet<>();
        
        s2.add(new Student("Khaled", 20, 3.2f));
        s2.add(new Student("Khaled", 20, 3.2f));
        
        System.out.println(s2.size());
        
        
        
        
        
        
    }
    
}
