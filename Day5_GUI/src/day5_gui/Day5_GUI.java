/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author dev
 */
public class Day5_GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame f=new JFrame("My App");
        f.setLayout(new FlowLayout());
        JButton b=new JButton("Click me");
        JButton b2=new JButton("Click me");

        f.add(b);
        f.add(b2);
        f.setBounds(400, 300,800,500);
        f.setVisible(true);
        
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

            }
        });
                
        
        
        
    }
    
}
