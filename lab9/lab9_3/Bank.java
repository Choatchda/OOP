/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9_3;

/**
 *
 * @author 66876
 */

public class Bank {
                private Account acct[];
                private   int numAcct; 
                
    
          public Bank(){
                    acct = new Account[10];
              
          
          }
          public void addAccount(Account ac){
                    acct[getNumAccount()] = ac;
                    numAcct += 1;
          }
          public Account getAccount(int index){
                       return acct[index];
          }
          public int  getNumAccount(){
                    return this.numAcct;
          }
}
