package JavaBasics.Day2.Practice;

public class SwapNumber {
    public static void main(String[] args) {

        //* ✅ Write a program to swap two numbers without using a third variable.

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
