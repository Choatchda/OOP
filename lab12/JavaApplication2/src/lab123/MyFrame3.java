/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab123;

/**
 *
 * @author LAB203_80
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class MyFrame3 {

    private JFrame f;
    private MyClock3 clock;
    private Thread t;

    MyFrame3() {
        f = new JFrame();
        clock = new MyClock3();
        t = new Thread(clock);
        t.start();
        f.add(clock);
        f.pack();
        f.setSize(450,200);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
    new MyFrame3();
    }
}
