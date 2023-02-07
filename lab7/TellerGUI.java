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
public class TellerGUI {
    private JFrame f;
    private JPanel bg0, bg1, bg2, bg3;
    private JLabel se1, se2, se3;
    private JButton b1, b2, b3;
    private JTextField under; 
    

   public TellerGUI(){
           f = new JFrame("Teller GUI");
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           bg0 = new JPanel();
           bg1 = new JPanel();
           bg2 = new JPanel();
           bg3 = new JPanel();
           b1 = new JButton("Deposit");
           b2 = new JButton("Withdraw");
           b3 = new JButton("Exit");
           se1 = new JLabel("Balance");
           se2 = new JLabel("6000");
           se3 = new JLabel("Amount");
           under = new JTextField();
           
           bg0.setLayout(new GridLayout(4, 1));
           bg1.setLayout(new GridLayout(1, 2));
           bg2.setLayout(new GridLayout(1, 2));
           bg3.setLayout(new GridLayout(1, 3));
           bg1.add(se1);
           bg1.add(se2);
           bg2.add(se3);
           bg2.add(under);
           bg3.add(b1);
           bg3.add(b2);
           bg3.add(b3);
           bg0.add(bg1);
           bg0.add(bg2);
           bg0.add(bg3);
           f.add(bg0);
           f.setSize(450, 250);
           f.setVisible(true);
           
        
    }
    
}
