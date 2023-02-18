/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10_2;
/**
 *
 * @author 66876
 */
public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount(){
        super(0, "");
        credit = 0;
        
    }
    public CheckingAccount(double balance, String name, double credit){
           super(balance, name);
           this.credit = credit;
    }
    public void setCredit(double credit){
        if(credit > 0){
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
            return this.credit;
    }
    @Override
    public void withdraw(double a) throws WithdrawException{
        if( getBalance() - a > 0 ){
            setBalance(getBalance() - a);
            System.out.println(a+" baht is withdrawn from "+getName()+" and your credit balance is "+ this.credit+ ".");
        }
        else if ( (getBalance() - a  < 0) && (getBalance() - a + getCredit() > 0)) {
            setCredit(getCredit() + (getBalance() - a ));
            setBalance(0);
            System.out.println(a+" baht is withdrawn from "+getBalance()+"  and your credit balance is "+ getCredit()+ ".");
            
        }
        else if ((balance - a < 0) && (balance - a + getCredit() < 0)){
//            System.out.println("Not enough money!");
            throw new WithdrawException("Acccount"+name+ " has not enough money.");
        }
        
    }
    
    public void withdraw(String a){
        try{
            withdraw(Double.parseDouble(a));
        }catch(Exception e){
            System.out.println(e);
                }
    }
    @Override
    public String toString(){
        return "The "+ this.name+" account has "+ this.balance + " baht and "+ this.credit+ " credits.";
        
    }
    


}




    

    
    
    


