/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_hello;

/**
 *
 * @author dev
 */
public class Demo {
    
    public static void main(String[] args) {
        
        int[] a={2,3,4,2,21,3,4,4,5,6,7,76,43,21,23,45,67,88,42};
        
        int max=-1;
        
        
        for (int i = 0; i < a.length; i++) {
            
            if(a[i]>max){
            max=a[i];
            }
        }
        
        System.out.println(max); 
        
    }
}
