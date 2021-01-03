/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dev
 */
public class Day5_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> list=new ArrayList<>();
        
        System.out.println(list.size());
        
        list.add("Boshra");
        list.add("Khaled");
        list.add("Abdullah");
        System.out.println(list);
        
        
        System.out.println(list.size());
        
        
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        list.add(1, "Abrar");
        list.set(2, "Khalid");
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);
        
        
        
    }
    
}
