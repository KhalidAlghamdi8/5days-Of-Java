/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_class;

/**
 *
 * @author dev
 */
public class Day1_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student s1=new Student("Abdullah",22,3.2f);
        
        
       Student s2=new Student("Boshra", 21, 3.3f);
       
        
     if(s1.getAge()>s2.getAge()){
     
         System.out.println(s1.getName()+" Is older");
     }else{
     
         System.out.println(s2.getName()+" is Older");
     
     }
       
       
     
     Student s3=new Student("Khaled",20,3.3f);
     
     s3.setGpa(3.4f);
     
    

    }
    
}
