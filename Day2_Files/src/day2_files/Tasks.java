/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Tasks {
    public static void main(String[] args) {
        
        
        try {
            int n= lines("myfile.txt");
            
            System.out.println("The file has "+n+" lines");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    static int lines(String fileName)throws Exception{
    
        FileReader fr=new FileReader(fileName);
        BufferedReader br=new BufferedReader(fr);
        
        String line=br.readLine();
        int counter=0;
        while (line!=null) {            
            counter++;
            
            line=br.readLine();
        }
    
        
        return counter;
    }

    

}
