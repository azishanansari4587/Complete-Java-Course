package JavaBasics.Day4;

public class MethodOverloading {
    public static void main(String[] args) {

        //? Method Overloading:
        //* Method overloading allows us to define multiple methods with same name but with different parameters (type, number or both).

        System.out.println("multiply 2 Numbers: "+multiply(5, 4));
        System.out.println("Multiply 3 numbers: "+ multiply(5, 4, 5));

    }

    //* Method with two parameters
    static  int multiply(int a, int b) {
        return  a * b;
    }

    //* Overloaded method with three parameters
    static int multiply(int a, int b, int c) {
        return  a * b * c;
    }

}
