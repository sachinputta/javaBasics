package Exceptions;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer:");

        try {
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
    
    
    
    
    
    
    
    
    
    
}