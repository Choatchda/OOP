/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 66876
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFrame implements MouseListener{
     private JFrame f;
     private MyClock c;
    private Thread t;
    private int checkpause = 0;
    
    public MyFrame(){
     f = new JFrame();
     c = new MyClock();
     t = new Thread(c);
     t.start();
     
     c.addMouseListener(this);
     
     f.setLayout(new FlowLayout());
     f.add(c);
     
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setSize(500,200);
     f.setLocationRelativeTo(null);
     f.setVisible(true);
     
     
    }
    public static void main(String[] args) {
        new MyFrame();
        
    }
     @Override
    public synchronized void  mouseClicked(MouseEvent ev){
        if(checkpause%2==0){
          c.pauseThred();
        }
        else{
            c.resumeThread();
        }
        checkpause++;
    }
     @Override
    public void mouseEntered(MouseEvent ev){}
     @Override
    public void mouseExited(MouseEvent ev){}
     @Override
    public void mousePressed(MouseEvent ev){}
     @Override
    public void mouseReleased(MouseEvent ev){}
    
}
