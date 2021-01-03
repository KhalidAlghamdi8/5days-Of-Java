/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_inheritance2;

import java.util.Arrays;
import java.util.Comparator;

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
        
        Car[] a=new Car[5];
        
        a[0]=new Car("BMW",2020, 100000);
        a[1]=new Car("Mercedes",2017, 120000);
        a[2]=new Car("Toyota",2018, 80000);
        a[3]=new Car("MAzda",2019, 90000);
        a[4]=new Car("Nissan",2021, 11000);
        
        
        class YearComparator implements Comparator<Car>{

            @Override
            public int compare(Car c1, Car c2) {
                
                if(c1.year>c2.year) return 1;
                else if(c1.year<c2.year) return -1;
                return 0;
                    
            }
        
        }
        
        Arrays.sort(a, new YearComparator());
        

        for (Car sayara : a) {
            System.out.println(sayara.name+"  "+sayara.year);
        }
        
    }
    
}
