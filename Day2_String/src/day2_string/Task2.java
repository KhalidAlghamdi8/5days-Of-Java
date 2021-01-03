/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_string;

/**
 *
 * @author dev
 */
public class Task2 {
    
    public static void main(String[] args) {
        
        String text="Landis's Missouri Battery, also known as Landis's Company, Missouri Light Artillery, was an artillery battery that served in the Confederate States Army during the early stages of the American Civil War. The battery was formed when Captain John C. Landis recruited men from the Missouri State Guard in late 1861 and early 1862. The battery fielded two 12-pounder Napoleon field guns and two 24-pounder howitzers for much of its existence, and had a highest reported numerical strength of 62 men. After initially serving in the Trans-Mississippi Theater, where it may have fought in the Battle of Pea Ridge, the unit was transferred east of the Mississippi River. The battery saw limited action in 1862 at the Battle of Iuka and at the Second Battle of Corinth.\n" +
"\n" +
"In 1863, the unit was transferred to Grand Gulf, Mississippi, a key point on the Mississippi River. After Major General Ulysses S. Grant landed Union infantry at Bruinsburg, Landis's Battery formed part of Confederate defenses at the battles of Port Gibson in early May, after which Landis was promoted and Lieutenant John M. Langan took command. Later that month, it took part in the Battle of Champion Hill. On May 17, the battery was part of a Confederate force tasked with holding the crossing of the Big Black River at the Battle of Big Black River Bridge, where it may have suffered the capture of two cannons. Landis's Battery next saw action during the Siege of Vicksburg. While there, the battery helped repulse Union assaults on May 22. Landis's Battery was captured when the Confederate garrison of Vicksburg surrendered on July 4. Although the surviving men of the battery were exchanged, the battery was not reorganized after Vicksburg; instead, it was absorbed into Guibor's Missouri Battery along with Wade's Missouri Battery.";
        
        String[] words=text.split(" ");
        
        for (String w : words) {
           
            System.out.println(w);
        }
        
        
       String lw= getLongestWord(text);
        
        System.out.println("The longest word is: "+lw);
        
        
        int r=repeatedWord(text, "on");
        System.out.println("The word repeated: "+r+"  times");
        
      
    }
    
    
    static String getLongestWord(String text){
    
        String[] words=text.split(" ");
        String longestWord="";
        for (String word : words) {
            if(word.length()>longestWord.length())
                longestWord=word;
        }
        
        return longestWord;
    }
   
    static int repeatedWord(String text,String word){
    
        int counter=0;
        
        String[] w=text.split(" ");
        for (String s : w) {
            if(s.equalsIgnoreCase(word))
                counter++;
        }
    
        return counter;
    }

     

}
