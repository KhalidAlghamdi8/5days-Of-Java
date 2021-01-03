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
public class Employee extends Human{
    int salary;

    public Employee( String name, int age,int salary) {
        super(name, age);
        this.salary = salary;
    }
    
    
}
