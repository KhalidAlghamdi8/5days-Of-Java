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
public class PostGraduate extends Student {
    int year;

    public PostGraduate( String name, int age, float gpa,int year) {
        super(name, age, gpa);
        this.year = year;
    }
    
    
    
}
