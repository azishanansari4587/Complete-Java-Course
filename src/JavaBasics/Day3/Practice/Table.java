package JavaBasics.Day3.Practice;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        //* ✅ Write a program to print the multiplication table of a given number using a for loop.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the which number of table");

        int table = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(table+" x "+i +" : "+table*i);
        }
    }
}
