/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_3;

/**
 *
 * @author 66876
 */
import java.util.*;
public class Customer {
    private String  firstName;
    private String  lastName;
    private ArrayList <Account> acct;
    private  int numOfAccount; 
    
       public Customer(){
       this("", "");
    }

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList <Account> ();
        
        }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
        
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
 
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int  getNumOfAccount(){
            return acct.size();
    }
   
   
   @Override
    public String toString(){
     return this.getFirstName() +" " + this.getLastName() +" " + "has " +  this.getNumOfAccount() + " accounts.";
}
    public void addAccount(Account acct){
            this.acct.add(acct); 
            numOfAccount += 1;
    }
    public  Account getAccount(int index){
            return acct.get(index);
    }
    
    
}

