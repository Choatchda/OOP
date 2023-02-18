/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 66876
 */
public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance  = balance;
        this.name = name;
    }
    public void setName(String name){
            this.name = name;
    }
    public  void setBalance(double balance){
            this.balance = balance;
    }
    public void deposit(double a){
        if (a > 0){
         balance += a;
         System.out.println(a+" baht is deposited to "+name+".");
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
 public void withdraw(double a) throws WithdrawException {
        if (a > 0 && getBalance() - a >= 0) {
            setBalance(getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + getName() + ".");
        } else {
            if (a < 0) {
                System.out.println("Input number must be a positive integer.");
            } else if (getBalance() - a < 0) {
//                System.out.println("Not enough money!");
                throw new WithdrawException("Account " + this.getName() + " has not enough money!");
            }
        }
    }
    
    public String getName(){
     return name;
    }
    public double getBalance(){
        return balance;
    }
    public void showAccount(){
        System.out.println(getName()+" account has "+ getBalance() + " baht.");
    }

    



}

