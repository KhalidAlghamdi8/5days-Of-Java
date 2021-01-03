/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_testclass;

import java.util.Date;

/**
 *
 * @author dev
 */
public class Test2 {
    public static void main(String[] args) {
        Date d=new Date();
        
        System.out.println(d.getDay()+"-"+d.getMonth()+"-"+d.getYear());
        
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        
    }
}
