/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_methods;

import java.util.Arrays;

/**
 *
 * @author dev
 */
public class Demo1 {
    
    
    public static void main(String[] args) {
    
   int[] a={3,4,5,6,7,4,4,5,6,67,4,3,4,5};    
   int[] b={5,3,4,56,7,8,6,4,6,3,4,56}; 
   
    
    
   System.out.println(compare(sum(a), sum(b)));
    
   
    float n=average(a);
    
    System.out.println("Average is :"+n);
 
  int m=max(a);
  
   System.out.println("Maximum number is:"+m);
   
    
    }
    
    
 static float average(int[] a){
    
    int sum=0;
    
        for (int i = 0; i < 10; i++) {
            sum+=a[i];
        }
    
        return sum/(float)a.length;
    }       
 static int sum(int[] a){
    
        int s=0;
        
        for (int i = 0; i < a.length; i++) {
            s+=a[i];
        }
    
        return s;
    }
 static int compare(int x,int y){
      if(x>y){
      return 1;
      }else if(x<y){
      
      return -1;
      }
      else
          return 0;
 }
 static float average2(int[] a){
 return sum(a)/(float)a.length;
 
 }
 static int max(int[] a){
  int m=a[0];
   
     for (int i = 0; i < a.length; i++) {
         if (a[i]>m) {
             m=a[i];
         }
     }
     
     return m;
 }



}
