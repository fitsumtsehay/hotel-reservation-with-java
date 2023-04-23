package model;

public class Driver {
    public static void main(String[] args) {
        // Valid email
        Customer customer1 = new Customer("first", "second", "j@domain.com");
        System.out.println(customer1);

        // Invalid email
        try {
            Customer customer2 = new Customer("first", "second", "email");
            System.out.println(customer2);
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid email format. " + ex.getMessage());
        }
    }
}






