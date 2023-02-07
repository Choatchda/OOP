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
public class MmGUI extends JFrame {
    private JDesktopPane big;
    private JFrame small;
    private JMenuBar bmenu;
    private JMenu m1, m2, m3, mnew;
    private JMenuItem sm2, sm3, sm4, msm1, msm2;
    private JInternalFrame frame1,  frame2, frame3;
    
    
    public MmGUI(){
    
                big = new JDesktopPane();
                
                
                bmenu = new JMenuBar();
                m1 = new JMenu("File");
                m2 = new JMenu("Edit");
                m3 = new JMenu("View");
                mnew  = new JMenu("New");
                sm2 = new JMenuItem("Open");
                sm3 = new JMenuItem("Save");
                sm4 = new JMenuItem("Exit");
                msm1 = new JMenuItem("Window");
                msm2 = new JMenuItem("Message");
                  
                big.add(bmenu);
                bmenu.add(m1);
                bmenu.add(m2);
                bmenu.add(m3);
                m1.add(mnew);
                m1.add(sm2);
                m1.add(sm3);
                m1.add(sm4);
                mnew.add(msm1);
                mnew.add(msm2);
                mnew.addSeparator();
                
                frame1 = new JInternalFrame("Application1", true, true, true, true);
                frame2 = new JInternalFrame("Application2", true, true, true, true);
                frame3 = new JInternalFrame("Application3" ,true, true, true, true);
                
                frame1.pack();
                frame1.setVisible(true);
                frame1.setSize(300, 200);
                frame1.setLocation(50, 500);
                
                frame2.pack();
                frame2.setVisible(true);
                frame2.setSize(400, 200);
                frame2.setLocation(350, 200);
                
                frame3.pack();
                frame3.setVisible(true);
                frame3.setSize(450, 200);
                frame3.setLocation(780, 350);
                
                big.add(frame1);
                big.add(frame2);
                big.add(frame3);
                
                
                
             this.setJMenuBar(bmenu);
             this.add(big,  BorderLayout.CENTER);
             this.setMinimumSize(new Dimension(300, 300));
             this.pack();
             this.setVisible(true);
             this.setExtendedState(this.MAXIMIZED_BOTH);
             this.setTitle("SubMenuItem Demo");
    }
    
}
