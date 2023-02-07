/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_28
 */
public class Sword extends  Item {
    @Override
    public void use(Player P){
        P.setATK(P.getATK()+10);
    }
    
    
}
