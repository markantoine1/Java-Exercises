/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Employee;

/**
 *
 * @author 886918
 */
public class Pogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String path = "C:\\x\\employees.csv";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> employees = new ArrayList<>();
        
            String line = br.readLine();
            while (line != null) {                
                String[] data = line.split(",");
                employees.add(new Employee(data[0], data[1],Double.parseDouble(data[2]))); 
                line = br.readLine();
            }
            System.out.print("Enter salary: ");
            Double salaryLimit = sc.nextDouble();
            
            List<String> emailList = employees.stream()
                    .filter(e -> e.getSalary() > salaryLimit)
                    .map(e -> e.getEmail())
                    .sorted()
                    .toList();
            
            System.out.println("Email of people whose salaty is more than " + String.format("%.2f", salaryLimit));
            emailList.stream().forEach(System.out::println);
            
            Double salaryFilter = employees.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x,y) -> x+y);
            
            System.out.println("Sum of salary whose name starts whith 'M':" + salaryFilter);
            
        }catch(Exception e){
            
        }
        
    }
    
}
