/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 66876
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Easycalculator implements ActionListener {
     private JFrame f;
        private JPanel top, down;
        private JButton b1, b2, b3, b4;
        private JTextField t1, t2, t3;
        
        public Easycalculator() {
            f = new JFrame("เครื่องคิดเลข");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            top = new JPanel();
            down = new JPanel();
            b1 = new JButton("Plus");
            b2 = new JButton("Lob");
            b3 = new JButton("kon");
            b4 = new JButton("divide");
            t1 = new JTextField();
            t2 = new JTextField();
            t3 = new JTextField();
            
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            
            top.setLayout(new GridLayout(4, 1));
            down.setLayout(new FlowLayout());
            top.add(t1);
            top.add(t2);
            down.add(b1);
            down.add(b2);
            down.add(b3);
            down.add(b4);
            top.add(down);
            top.add(t3);
            f.add(top);
            f.setSize(450, 250);
             f.pack(); 
            f.setVisible(true);
}
        @Override
        public void actionPerformed(ActionEvent ev){
            double num1 =  Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double num3;
        if(ev.getSource().equals(b1)){
            num3 = num1+num2;
            t3.setText("" +num3);
            System.out.println("b1");
        }else if(ev.getSource().equals(b2)){
            num3 = num1-num2;
            t3.setText(""+num3);
            System.out.println("b2");
        }
        else if(ev.getSource().equals(b3)){
            num3 = num1*num2;
            t3.setText(""+num3);
            System.out.println("b3");
        }
        else if (ev.getSource().equals(b4)){
                    num3 = num1/num2;
                    t3.setText("" + num3);
                    System.out.println("b4");
        }
            
        }
}
