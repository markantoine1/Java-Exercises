/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Estudos
 */
public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }
    
    public Account(Integer nuumber, String holder, Double balance) {
        this.number = nuumber;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNuumber() {
        return number;
    }

    public void setNuumber(Integer nuumber) {
        this.number = nuumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
}
