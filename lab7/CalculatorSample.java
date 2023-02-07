/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_44
 */
import javax.swing.*;
import java.awt.*;
public class CalculatorSample {
         private JFrame f;
         private JPanel top, down;
         private JTextField tf;
         private JButton one;
         private JButton two;
         private JButton three;
         private JButton four;
         private JButton five;
         private JButton six;
         private JButton seven;
         private JButton eight;
         private JButton nine;
         private JButton ten;
         private JButton eleven;
         private JButton twe;
         private JButton thr;
         private JButton fourt;
         private JButton fift;
         private JButton sixt;
    public CalculatorSample() {
            f = new JFrame("My calculator");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            top = new JPanel();
            down = new JPanel();
            tf = new JTextField();
            one = new JButton("7");
            two = new JButton("8");
            three = new JButton("9");
            four = new JButton("+");
            five = new JButton("4");
            six = new JButton("5");
            seven = new JButton("6");
            eight = new JButton("-");
            nine = new JButton("1");
            ten = new JButton("2");
            eleven = new JButton("3");
            twe = new JButton("x");
            thr = new JButton("0");
            fourt = new JButton("c");
            fift = new JButton("=");
            sixt = new JButton("/");
            top.setLayout( new BorderLayout());
            top.add(tf,BorderLayout.NORTH);
            down.setLayout(new GridLayout(4, 4));
            down.add(one);
            down.add(two);
            down.add(three);
            down.add(four);
            down.add(five);
            down.add(six);
            down.add(seven);
            down.add(eight);
            down.add(nine);
            down.add(ten);
            down.add(eleven);
            down.add(twe);
            down.add(thr);
            down.add(fourt);
            down.add(fift);
            down.add(sixt);
            f.add(tf,BorderLayout.NORTH);
            f.add(down);
            f.setSize(250, 250);
            f.setVisible(true);
                    
            
            
            
            
        }
 

}



