/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12;

/**
 *
 * @author LAB203_80
 */

import java.util.Calendar;
import javax.swing.*;
import java.awt.*;
public class MyClock extends JLabel implements Runnable {
        private int time;
        private boolean paused;
        @Override
        public void run(){
                    try{
                        while(true){
                        checkPause();
                        Calendar ca = Calendar.getInstance();
                        int sec = ca.get(Calendar.SECOND);
                        int min = ca.get(Calendar.MINUTE);
                        int hour = ca.get(Calendar.HOUR_OF_DAY);
                        
                        this.setEnabled(false);
                        this.setBorder(null);
                        this.setFont(new Font ("Tahoma",Font.BOLD,70));
                        this.setText(String.format("%02d:%02d:%02d", hour,min,sec));
                        Thread.sleep(1000);
                        
                        }
                    }catch(Exception e){
                        System.out.println(e);
                    }
                
        }
        public void pauseThred(){
            paused = true;
            System.out.println("Paused");
            
        }
        public void checkPause(){
            while(paused){
                try{
                    this.wait();
                
                }catch(Exception e){
                    e.printStackTrace();
                }
                
            }
        }
        public synchronized void resumeThread(){
            paused = false;
            this.notify();
            System.out.println("UnPaused");
        }
    
}

