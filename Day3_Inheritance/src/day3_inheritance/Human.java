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
public class Human {
    String name;
    int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    
    public void printInformation(){
    
        System.out.println(name);
        System.out.println(age);
    
    }
    
}
