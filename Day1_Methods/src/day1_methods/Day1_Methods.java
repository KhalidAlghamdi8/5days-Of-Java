/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_methods;

/**
 *
 * @author dev
 */
public class Day1_Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        int v=compare(7, 12);
    
        System.out.println(v);
    }
    
    
    
    static int compare(int x,int y){
      if(x>y){
      return x;
      }else{
      
      return y;
      }
    }
    
    
    
    
    public static void myMethod(){
    
        System.out.println("Test Method");
    }
    
    
}
