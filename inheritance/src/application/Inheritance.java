/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/**
 *
 * @author Estudos
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());
        
        Account acc2 = new SavingsAccount(0.01, 1002, "John", 1000.0);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());    
        
        Account acc3 = new BusinessAccount(500.00, 1003, "bob", 1000.00);
        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());
        
    }
    
}
