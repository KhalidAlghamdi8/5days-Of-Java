/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_inheritance2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dev
 */
public class App3 {
    public static void main(String[] args) {
        
        
        JFrame f=new JFrame("My App");
        JButton b=new JButton("Click me");
        JLabel l=new JLabel("X=100 y=100");
        f.add(b,BorderLayout.NORTH);
        f.add(l,BorderLayout.SOUTH);
        f.setBounds(200, 200, 800, 600);
        f.setVisible(true);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                
                
            }
        });
        
        f.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent arg0) {
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                
                l.setText("X="+me.getX()+"  Y="+me.getY());
            }
        });
        
        
    }
}
