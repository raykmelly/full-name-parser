package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Get the scanner
        Scanner scanner = new Scanner(System.in);
        // Prompt for your first, middle, last name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine().trim();
        // Split by the spaces
        String[] nameParts = name.split(" ");

        if (nameParts.length == 3) {
            // You have a fist, middle, last name
            System.out.printf("First name: %s",nameParts[0]);
            System.out.printf("Middle name: %s",nameParts[1]);
            System.out.printf("Last name: %s",nameParts[2]);
        } else if (nameParts.length == 2) {
            // You only have a first, last name
            System.out.printf("First name: %s",nameParts[0]);
            System.out.println("Middle name: (none)");
            System.out.printf("Last name: %s",nameParts[1]);
        }
    }
}