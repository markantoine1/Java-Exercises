/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import entities.Employee;
import entities.OutsoucedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Estudos
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        
        System.out.print("Enter the number of employees:");
        int x = sc.nextInt();
        
        for (int i = 1; i <= x; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced(y/n)?");
            String answer = sc.next();
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours:");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour:");
            double valuePerHour = sc.nextDouble();
            
            if (answer.equals("y")) {
                System.out.print("Additional charge:");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsoucedEmployee(additionalCharge, name, hours, valuePerHour));
            }else{
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println("");
        System.out.println("PAYMENTS:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    
}
