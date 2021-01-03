/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_inheritance;

/**
 *
 * @author dev
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human[] a=new Human[10];        
        
        // Polymorphic Object
        a[0]=new Student("Khaled", 20, 3.2f);
        a[1]=new Student("Meshmesh", 21, 3.0f);
        a[2]=new Employee("Da3door", 30, 12000);
        a[3]=new Student("safroota", 20, 2.6f);
        a[4]=new Student("Meshmesha", 21, 3.0f);
        a[5]=new Teacher("Safroot", 33, 15000, "Math");
        a[6]=new Employee("warda", 30, 11000);
        a[7]=new Employee("Da3doora", 30, 13000);
        a[8]=new Teacher("Safroot", 33, 15000, "English");
        a[9]=new PostGraduate("3azooz", 28, 3.6f, 2016);
        
        
        System.out.println("average of ages is: "+ageAverage(a));
        
        System.out.println("Number os students is "+studentCount(a));
        
        System.out.println("GPA average is  "+ studentGPAavg(a));
    }
    
    
    static float ageAverage(Human[] a){
    float avg=0;
    int sum=0;
        
        for (Human human : a) {
            sum+=human.age;
            
        }
    
        return sum/(float)a.length;
    }
    

    static int studentCount(Human[] a){
    
        int counter=0;
        for (Human human : a) {
             if(human.getClass() == Student.class )
                 counter++;
        }
    
        return counter;
    }

    static float studentGPAavg(Human[] a){
    
        float sum=0;
        
         for (Human human : a) {
            if(human.getClass()== Student.class){
            Student s2=(Student)human;
            sum+= s2.gpa;
            }
             
        }
        
        return sum/studentCount(a);
    }
}
