/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_string;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Task1 {
    public static void main(String[] args) {
        
        System.out.println("Please enter your email");
        
        Scanner sc=new Scanner(System.in);
        
        String email= sc.nextLine();
        
        String name,mail,ext;
        
        int atIndex=email.indexOf("@");
        
        name=email.substring(0,atIndex);
        
        System.out.println(name);
       
        int dotIndex=email.indexOf(".");
        
        mail= email.substring(atIndex+1, dotIndex);
        
        System.out.println(mail);
        
        ext=email.substring(dotIndex+1);
        
        System.out.println(ext);
        
    }
}
