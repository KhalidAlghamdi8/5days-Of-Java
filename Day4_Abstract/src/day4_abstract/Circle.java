/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_abstract;

/**
 *
 * @author dev
 */
public class Circle extends Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
    return Math.PI*r*r;
    }


    
    
}
