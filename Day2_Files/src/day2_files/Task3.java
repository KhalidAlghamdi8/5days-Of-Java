/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Task3 {
    
    public static void main(String[] args) {
        
        try {
            
        copyFile("myfile.txt", "copycopy.txt");
      
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
   static void copyFile(String from,String to)throws Exception{
   
   
       FileWriter fw=new FileWriter(to);
       
       BufferedReader br=new BufferedReader(new FileReader(from));
       String line=br.readLine();
       
       while (line!=null) {           
            
           fw.write(line +"\n");
           line=br.readLine();
       }
       
      fw.close();
      
   }
}
