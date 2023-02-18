/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_80
 */
package lab12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PoringConstructor implements ActionListener{
                int numberOfPoring;
                private JButton b;
                private JFrame f;
                private Poring poring;
                public PoringConstructor(){
                    f = new JFrame();
                    b = new JButton("Add");
                    
                    b.addActionListener(this);
                    
                    f.setLayout(new FlowLayout());
                    f.add(b);
                    
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setSize(170, 75);
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                           
                }
                @Override
                public void actionPerformed(ActionEvent ev){
                    if(ev.getSource().equals(b)){
                            numberOfPoring++;
                            Poring poring = new Poring(numberOfPoring);
                            Thread thread = new Thread(poring);
                            thread.start();
                            
                    }
                
                
                }
          public static void main(String[] args) {
              new PoringConstructor();
          }
    
    
    
}

