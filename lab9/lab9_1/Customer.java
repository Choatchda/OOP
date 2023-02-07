/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_1;
/**
 *
 * @author 66876
 */
public class Customer {
    private String  firstName;
    private String  lastName;
    private CheckingAccount acct;
    
    public Customer (String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
        }
    public Customer(){
       this("", "", null);
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
        
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public void setAcct (CheckingAccount acct){
            this.acct = acct;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public CheckingAccount getAcct(){
        return this.acct;
    }
   @Override
    public String toString(){
        if(this.acct == null){
            return  getFirstName() +" "+ getLastName() + " doesn’t have account.";
        }
        else{
            return "The "+ getFirstName() + " account has " + acct.getBalance()+ " baht and "+ acct.getCredit() + " credits." ;
        }
    }
    public boolean equals(Customer c){
        return (this.getFirstName().equals(c.getFirstName())&& this.getLastName().equals(c.getLastName()));
    }

}

