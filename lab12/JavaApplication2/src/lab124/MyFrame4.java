/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab124;
/**
 *
 * @author LAB203_80
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFrame4 implements MouseListener {

    private JFrame f;
    private MyClock4 clock;
    private Thread t;
    
    MyFrame4() {
        f = new JFrame();
        clock = new MyClock4();
        t = new Thread(clock);
        t.start();
        f.add(clock);

        clock.addMouseListener(this);
        f.pack();
        f.setSize(450, 200);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    

    @Override
    public synchronized void mouseClicked(MouseEvent e) {
        if(clock.getPaused()){
            clock.resumeThread();
        }else{
            clock.pauseThread();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MyFrame4();
    }

}
