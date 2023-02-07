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
public class Calculator implements ActionListener {
          int num1;
          int num2;
          int num3;
         String text;
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
    public Calculator() {
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
            one.addActionListener(this);
            two.addActionListener(this);
            three.addActionListener(this);
            four.addActionListener(this);
            five.addActionListener(this);
            six.addActionListener(this);
            seven.addActionListener(this);
            eight.addActionListener(this);
            nine.addActionListener(this);
            ten.addActionListener(this);
            eleven.addActionListener(this);
            twe.addActionListener(this);
            thr.addActionListener(this);
            fourt.addActionListener(this);
            fift.addActionListener(this);
            sixt.addActionListener(this);
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
    @Override
    public void actionPerformed(ActionEvent ev){
    if(ev.getSource().equals(one)){
            tf.setText(tf.getText() +"7");
    }
    else   if(ev.getSource().equals(two)){
            tf.setText(tf.getText() +"8");
    }
    else if(ev.getSource().equals(three)){
            tf.setText(tf.getText() +"9");
    }
    else if(ev.getSource().equals(four)){
            num1  = Integer.parseInt(tf.getText());
            tf.setText("");
            text = "+";   
          }
    else   if(ev.getSource().equals(five)){
            tf.setText(tf.getText() +"4");
    }
    else   if(ev.getSource().equals(six)){
            tf.setText(tf.getText() +"5");
    }
     else   if(ev.getSource().equals(seven)){
            tf.setText(tf.getText() +"6");
    }
     else   if(ev.getSource().equals(eight)){
            num1  = Integer.parseInt(tf.getText());
            tf.setText("");
            text = "-";   
          }
     else   if(ev.getSource().equals(nine)){
            tf.setText(tf.getText() +"1");
    }
       else   if(ev.getSource().equals(ten)){
            tf.setText(tf.getText() +"2");
    }
       else   if(ev.getSource().equals(eleven)){
            tf.setText(tf.getText() +"3");
    }
      else   if(ev.getSource().equals(twe)){
            num1  = Integer.parseInt(tf.getText());
            tf.setText("");
            text = "x";   
          }
    else   if(ev.getSource().equals(thr)){
            tf.setText(tf.getText() +"0");
    }
    else if (ev.getSource().equals(fourt)){
            tf.setText("");
            num1 = 0;
            num2 = 0;
            num3 = 0;
    }
    else if(ev.getSource().equals(fift)){
        switch(text){
            case "+" ->{
                num2 = num1+Integer.parseInt(tf.getText());
                tf.setText(Integer.toString(num2));
            }
            case "-" ->{
                num2 = num1 - Integer.parseInt(tf.getText());
                tf.setText(Integer.toString(num2));
            }
            case"x" ->{
                num2 = num1*Integer.parseInt(tf.getText());
                tf.setText(Integer.toString(num2));
            }
            case"/" ->{
                num2 = num1/Integer.parseInt(tf.getText());
                tf.setText(Integer.toString(num2));
            }
        }
    }
    else if (ev.getSource().equals(sixt)){
            num1 = Integer.parseInt(tf.getText());
            tf.setText("");
            text = "/";
    }

    }
}
