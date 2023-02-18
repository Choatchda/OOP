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
import java.io.*;
public class Poring extends JFrame implements Runnable, MouseListener{
    private JFrame f;
    private JTextField tf;
    private JLabel lb;
    public Poring(int numberOfPoring){
        f = new JFrame();
        tf = new JTextField(numberOfPoring+"");
        lb = new JLabel(new ImageIcon("lab12/Poring.png"));

        tf.setEditable(false);
        tf.setBorder(null);
         f.setLayout(new FlowLayout());
         f.add(lb); f.add(tf);
         
         lb.addMouseListener(this);
         
         
         f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         f.setSize(170, 135);
         Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
         f.setLocation((int)(Math.random()*(dimension.getWidth()-f.getWidth())),
                 (int)(Math.random()*(dimension.getHeight()-f.getHeight())));
         f.setResizable(false);
         f.setVisible(true);
        }
    @Override
        public void run(){
                    try{
                    while(true){
                    Thread.sleep(10);
                    if(Math.random()<= 0.5){
                           if(Math.random()<= 0.5){
                     }else{
                           f.setLocation(f.getX()-2, f.getY()-2);
                           }
                    }else{
                        if(Math.random() <= 0.5){
                            f.setLocation(f.getX()+2, f.getY()-2);
                        }else{
                            f.setLocation(f.getX()-2, f.getY()+2);
                        }
                    }
                }
        }catch(Exception ex){
            System.out.print(ex);
        }
        }
    @Override
        public synchronized void mouseClicked(MouseEvent ev){}
    @Override
        public void mousePressed(MouseEvent ev){
            f.dispose();
        }
    @Override
        public void mouseReleased(MouseEvent ev){}
    @Override
        public void mouseEntered(MouseEvent ev){}
    @Override
        public void mouseExited(MouseEvent ev){}
        
}
