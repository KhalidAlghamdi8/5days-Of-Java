/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dev
 */
public class Task2 {
    
    public static void main(String[] args) {
        ArrayList<Student> l=new ArrayList<>();
        
        l.add(new Student("Khaled", 20, 3.1f));
        l.add(new Student("Ahmed", 21, 3.2f));
        l.add(new Student("Khaled", 20, 3.1f));
        l.add(new Student("Ahmed", 21, 3.2f));
        l.add(new Student("Khaled", 20, 3.1f));
        l.add(new Student("Ahmed", 21, 3.2f));
        
        
        Collections.sort(l,new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                
                if(s1.getGpa()>s2.getGpa())return 1;
                else if(s1.getGpa()<s2.getGpa())return -1;
                return 0;
            }
        });
        
        for (Student student : l) {
            System.out.println(student.getName()+"   "+student.getGpa());
        }
    }
}
