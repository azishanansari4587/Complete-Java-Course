package JavaBasics.Day3.Practice;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        //* ✅ Write a program to check if a number is positive, negative, or zero using an if-else statement.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }


        scanner.close(); //* Close the scanner
    }
}
