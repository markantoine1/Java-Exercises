/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Estudos
 */
public final class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(double interestRate, Integer nuumber, String holder, Double balance) {
        super(nuumber, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount; 
    }
    
   
}
