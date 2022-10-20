/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Estudos
 */
public class OutsoucedEmployee extends Employee{
    
    private Double additionalCharge;

    public OutsoucedEmployee(double additionalCharge, String name, Integer hours, double valuePerHour) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + (additionalCharge * 1.1); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
