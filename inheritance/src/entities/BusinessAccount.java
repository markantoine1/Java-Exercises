/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Estudos
 */
public class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(double loanLimit, Integer nuumber, String holder, Double balance) {
        super(nuumber, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(double amount){
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        balance -= 2.0;
    }
    
    
}
