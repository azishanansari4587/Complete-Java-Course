package JavaBasics.Day2;

public class Variables {

    int instanceVariables1 = 10;
    int instanceVariables2 = 20;
    static int staticVariables = 30;

    public static void main(String[] args) {



        //! Ques: What are variables?
        //* Ans: Variables are named containers for storing data values.

        //* TODO: dataType variableName = value;

        //? 🚀 Types of Variables
        //*    ✅ Local Variables: Variables declared within a method or block
        int localVariables1 = 10;
        int localVariables2 = 20;
        add(localVariables1, localVariables2);


        //*    ✅ Instance Variables : Variables declared within a class, but outside any method or block
        Variables variables = new Variables();
        System.out.println("Instance Variables 1: "+variables.instanceVariables1);
        System.out.println("Instance Variables 1: "+variables.instanceVariables2);


        //*    ✅ Static Variables: Variables declared within a class, but outside any method or block, and are shared among all instances of the class
        System.out.println("Static Variables: "+staticVariables);

    }

    //* It's Method (block of code)
    public static void add(int localVariables1, int localVariables2) {

        int c =localVariables1 + localVariables2;
        System.out.println("Local Variables: "+c);
    }
}
