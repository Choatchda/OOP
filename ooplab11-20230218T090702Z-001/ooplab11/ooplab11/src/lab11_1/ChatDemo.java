/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11_1;
/**
 *
 * @author 66876
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener {
    private JFrame f;
    private JPanel p, p1, p2, p3;
    private JTextArea ta;
    private JTextField tf;
    private JButton bts, btr;
    String Chat="";
    public ChatDemo(){
       f = new JFrame("ChatDemo");
       ta = new JTextArea();
       tf = new JTextField();
       bts = new JButton("Submit");
       btr = new JButton("Reset");
       p = new JPanel();
       p1 = new JPanel();
       p2 = new JPanel();
       p3 = new JPanel();
       
       ta.setRows(20);
       ta.setColumns(45);
       
       p.setLayout(new BorderLayout());
       
       p1.setLayout(new BorderLayout());
       p1.add(ta);
       ta.setEnabled(false);
       
       
       p2.setLayout(new BorderLayout());
       p2.add(tf, BorderLayout.SOUTH);
       p2.setSize(100, 5);
       
       p3.add(bts);
       p3.add(btr);
       
       p.add(p1, BorderLayout.NORTH);
       p.add(p2);
       p.add(p3, BorderLayout.SOUTH);
       
       bts.addActionListener(this);
       btr.addActionListener(this);
       f.addWindowListener(this);
       
       f.add(p);
       f.pack();
       
       f.setSize(600,415);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent et){
                if(et.getSource().equals(bts)){
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
                         ta.setText(ta.getText()+dtf.format(LocalDateTime.now())+":"+tf.getText()+"\n");
                         tf.setText("");
                }
                else if (et.getSource().equals(btr)){
                    ta.setText("");
                    tf.setText("");
                }
    }
    @Override
    public void windowClosing(WindowEvent e){
               try(FileWriter fw = new FileWriter("ChatDemo.dat")){
                    Chat = ta.getText();
                    fw.write(Chat);
               }catch(IOException eo){
                   System.out.println(eo);
               } 
    
    }
    @Override
    public void windowClosed(WindowEvent e){}
    @Override
    public void windowIconified(WindowEvent e){}
    @Override
    public void windowDeiconified(WindowEvent e){}
    @Override
    public void windowActivated(WindowEvent e){}
    @Override
    public void windowDeactivated(WindowEvent e){}
    @Override
    public void windowOpened(WindowEvent ev){
                       try(FileReader fa = new FileReader ("ChatDemo.dat")){
                           int read;
                           while ((read = fa.read()) != -1){
                               Chat += (char) read;
                           }
                           ta.setText(Chat);
                       }catch(IOException er){
                           er.printStackTrace();
                       }
    }
    public static void main(String[] args){
        new ChatDemo();
    } 


    
}
