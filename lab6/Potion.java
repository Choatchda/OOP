/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_28
 */
public class Potion extends Item{
@Override    

       public void use (Player P){
           P.setHP(P.getHP()+10);
       } 
    
    
}
