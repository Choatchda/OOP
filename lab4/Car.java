/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 66876
 */
public class Car extends Vehicle{
    private String typeEngine;
    public void setTypeEngine (String t) {
        typeEngine = t;
    }
    public String getTypeEngine() {
        return typeEngine;
    }
    public  void setCarInfo(int s, String t, String y){
       fuel = s;
       topSpeed = t;
       typeEngine = y;
     }
    public void move(){
        System.out.println("move");
        fuel -= 50;
        if(fuel == 0){
            System.out.println("Please add fuel");
        }
    
    }
    public void showCarInfo(){
        System.out.println("Car engine is ["+ typeEngine + "].");
        System.out.println("Fuel is ["+ fuel +"] litre and Top Speed is ["+ topSpeed +"] m/s.");
        
    }
}
