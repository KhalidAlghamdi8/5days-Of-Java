/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_files;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author dev
 */
public class Day2_Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            
           
            FileReader fr=new FileReader("myfile.txt");
            BufferedReader br=new BufferedReader(fr);
            
            String line= br.readLine();
            
            while (line!=null) {                
                
                System.out.println(line);

                line=br.readLine();
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    
    
    
}
