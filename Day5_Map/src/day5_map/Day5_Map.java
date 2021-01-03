/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dev
 */
public class Day5_Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<String,String> map=new HashMap<>();
        
        map.put("username", "meshmesh");
        map.put("email", "meshmesh@gmail.com");
        map.put("fullname", "Khaled Hosni");
        
        
        System.out.println(map.get("email"));
        
        
        Set<String> s=map.keySet();
        
        for (String key : s) {
            
            
            System.out.println(key +"   "+map.get(key));
        }
        
        
        
        
    }
    
}
