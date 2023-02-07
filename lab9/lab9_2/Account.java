/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_2;

/**
 *
 * @author 66876
 */
public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
                this.balance = balance;
                this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
            return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    
    }
   public double getBalance(){
        return balance;
   }
   public void deposit(double b){
      if (b<0){
        System.out.println("Input number must be a positive integer.");
        }
        else{
           System.out.println( b +" baht is deposited to " + name + ".");
           balance += b;
      }
    }
       public void withdraw(double a){
        if(  a <0){
         System.out.println("Input number must be a positive integer");
        }
        else if((balance - a)<0){
            System.out.println("Not enought money!");
        }
        else{
            System.out.println( a +" baht is withdrawn from " + name + ".");
            balance -= a;
        }
    }
      public void showAccount(){
        System.out.println(name+" account has "+ balance + " baht.");
    }

   
    
}
