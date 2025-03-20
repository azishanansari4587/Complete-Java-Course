package JavaBasics.Day2.Practice;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        //* ✅ Write a program that takes two numbers from the user and performs all arithmetic operations on them.

        //* TODO: Scanner is used to take input from the user.

        Scanner scanner = new Scanner(System.in);

        //* nextInt() is used to take input from the user in integer format.
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulus : " + (a % b));
    }
}
