/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_files;

import java.io.FileWriter;
import java.util.Date;

/**
 *
 * @author dev
 */
public class Task2 {
 
    public static void main(String[] args) {
        
        try {
            
            FileWriter fw=new FileWriter("myNewFile.txt",true);
            fw.write(new Date() + "  Hello \n");
            fw.close();
            
            
        } catch (Exception e) {
        e.printStackTrace();
        }
        
        
    }
}
