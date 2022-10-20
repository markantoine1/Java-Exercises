package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Estudos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("#####Enter client data:#####");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Email:");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf.parse(sc.next());
        System.out.print("#####Enter status data:#####");
        String status = sc.next();
        System.out.println("How many items to this order?");
        Integer qtd = sc.nextInt();
        
        Client client = new Client(name, email, birthDate);
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
        
        for (int i = 1; i <= qtd; i++) {
            System.out.println("#####PRODUCT #"+i+":");
            System.out.print("Product name:");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price:");
            Double price = sc.nextDouble();
            
            Product product = new Product(productName, price);
            
            System.out.print("Quantity:");
            Integer quantity = sc.nextInt();
            
            order.addItem(new OrderItem(quantity, price, product));
        }
        System.out.println("#####ORDER SUMMARY#####");
        System.out.print(order);
        System.out.print(client);
        System.out.println("Order Items:");
        
            System.out.println(order);
        }
    
}
