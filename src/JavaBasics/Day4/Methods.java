package JavaBasics.Day4;

public class Methods {

    public static void main(String[] args) {

        //! Ques: What are Methods in Java?
        //* Ans: A method is a block of code that performs a specific task. Methods help in a code reusability, modularity and readability.

        //? Syntax of a Method
        //* returnType methodName(parameters) {
        //*   return value;
        //* }

        greet();
        greetUsers("Zishan");
        System.out.println(addNumber(10, 20));;
    }

    //* Method with No Parameters and No Return Type
    static void greet() {
        System.out.println("Hello! Welcome to Java.");
    }

    //* Method with Parameters
    static void greetUsers(String name){
        System.out.println("Hello "+ name+ " !");
    }

    //* Methods with Return Type
    static int addNumber(int a, int b) {
        return a + b;
    }


}
