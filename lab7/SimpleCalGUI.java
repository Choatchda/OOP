/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 66876
 */
import javax.swing.*;
import java.awt.*;
public class SimpleCalGUI {
        private JFrame f;
        private JPanel top, down;
        private JButton b1, b2, b3, b4;
        private JTextField t1, t2, t3;
        
        public SimpleCalGUI () {
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
            f.setVisible(true);
}
}