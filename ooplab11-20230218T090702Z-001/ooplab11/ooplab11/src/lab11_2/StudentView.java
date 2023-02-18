/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11_2;
/**
 *
 * @author 66876
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener{
    private JFrame f;
    private JPanel p,p1,p2;
    private JLabel id, na, mo;
    private JTextField idt, nat, mot;
    private JButton btd, btw;
    public StudentView(){
     f = new JFrame();
     p = new JPanel();
     p1 = new JPanel();
     p2 = new JPanel();
     id = new JLabel("ID :");
     na = new JLabel("Name :");
     mo = new JLabel("Money :");
     idt = new JTextField();
     nat = new JTextField();
      mot = new JTextField();
      btd  = new JButton("Deposit");
      btw = new JButton("Withdraw");
      
      mot.setEditable(false);
      
      p1.setLayout(new GridLayout(3,2));
      p1.add(id);         p1.add(idt);
      p1.add(na);        p1.add(nat);
      p1.add(mo);       p1.add(mot);
      
      p2.setLayout(new FlowLayout());
      p2.add(btd);
      p2.add(btw);
      
      p.setLayout(new BorderLayout());
      p.add(p1, BorderLayout.NORTH);
      p.add(p2, BorderLayout.SOUTH);
      
      btd.addActionListener(this);
      btw.addActionListener(this);
      f.addWindowListener(this);
      
      f.add(p);
      f.pack();
      
      f.setSize(200,200);
      
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
    }
    
    @Override
    public void actionPerformed(ActionEvent ev){
               if(ev.getSource().equals(btd)){
                mot .setText((Integer.parseInt(mot.getText()))+100+"");
               }
               else if (ev.getSource().equals(btw)){
                   if((Integer.parseInt(mot.getText())-100)<0){
                       mot.setText("0");
               
               }
                   else {
                       mot.setText((Integer.parseInt(mot.getText()))-100+"");
                    }
               }
    
    }
    @Override
    public void windowOpened(WindowEvent ev){
        Student s = null;
        try (FileInputStream fis = new FileInputStream("StudentM.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);){
            s = (Student) ois.readObject();
        }catch(IOException e){
         System.out.println(e);
        }catch(ClassNotFoundException c){
            System.out.println(c);
        
    
    }
        if(s != null){
            idt.setText(s.getID()+"");
            nat.setText(s.getName()+"");
            mot.setText(s.getMoney()+"");
        }
        else{
            idt.setText("");
            nat.setText("");
            mot.setText(0+"");
        }
    
    }
    @Override
    public void windowIconified(WindowEvent e){}
    @Override
    public void windowDeiconified(WindowEvent e){}
    @Override
    public void windowActivated(WindowEvent e){}
    @Override
    public void windowDeactivated(WindowEvent e){}
    @Override
    public void windowClosed(WindowEvent ev){}
    @Override
    public void windowClosing(WindowEvent ev){
            try(FileOutputStream fos  = new FileOutputStream("StudentM.dat");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);){
                           oos.writeObject(new Student(nat.getText(), Integer.parseInt(idt.getText()), Integer.parseInt(mot.getText())));
                        
            }catch(IOException e){
                System.out.println(e);
            }
    }
    public static void main(String[] args){
            new StudentView();
    }
    
    
}
