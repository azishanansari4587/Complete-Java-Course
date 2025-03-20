package JavaBasics.Day4;

public class Recursion {
    public static void main(String[] args) {

        //TODO: Recursion (Method Calling by Itself)
        //* A recursive method is a method that calls by itself until a base condition is met.

        System.out.println("factorial of 5: "+ factorial(5));

    }

    static int factorial(int n) {
        if (n == 1)
            return 1; //* Base Conditions
        return n * factorial(n - 1); //* Recursive Call
    }
}
