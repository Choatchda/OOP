/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_2;
/**
 *
 * @author 66876
 */
public class Customer {
    private String  firstName;
    private String  lastName;
    private Account acct[];
    private  int numOfAccount; 
    
       public Customer(){
       this("", "");
    }

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
        
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
            return this.numOfAccount;
    }
   
   
   @Override
    public String toString(){
     return this.getFirstName() +" " + this.getLastName() +" " + "has " +  this.getNumOfAccount() + " accounts.";
}
    public void addAccount(Account acct){
            this.acct[getNumOfAccount()] = acct;
            numOfAccount += 1;
    }
    public  Account getAccount(int index){
            return this.acct[index];
    }
    
    
}

