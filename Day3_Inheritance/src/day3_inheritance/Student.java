/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_inheritance;

/**
 *
 * @author dev
 */
public class Student extends Human{
    float gpa;

    public Student() {
    }

    public Student( String name, int age,float gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public void printInformation() {
       super.printInformation();
        System.out.println(gpa);
    }
    
    
    
    
}
