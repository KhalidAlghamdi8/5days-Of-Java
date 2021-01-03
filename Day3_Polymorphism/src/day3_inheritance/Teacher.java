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
public class Teacher extends Employee{
    String subject;

    public Teacher( String name, int age, int salary,String subject) {
        super(name, age, salary);
        this.subject = subject;
    }
    
    
}
