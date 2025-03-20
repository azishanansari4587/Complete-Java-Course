package JavaBasics.Day2;

import java.util.Arrays;

public class DataTypes {

    public static void main(String[] args) {

        //! 🚀 Data Types
        //?    ✅ Primitive Data Types: (store simple values)
        //?    ✅ Non-Primitive Data Types: (store complex values and objects)

        //? 🚀 Primitive Data Types
        //?    ✅ Numeric Data Types: (int, float, double, long, short, byte)
        //?    ✅ Character Data Type: (char)
        //?    ✅ Boolean Data Type: (boolean)

        int age = 25;
        double height = 5.5;
        char gender = 'M';
        boolean isStudent = true;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("Is Student: " + isStudent);

        //? 🚀 Non-Primitive Data Types
        //?    ✅ String Data Type: (String)
        //?    ✅ Array Data Type: (int[])
        //?    ✅ Object Data Type: (Object)

        String name = "John"; //* String
        int[] numbers = {1, 2, 3}; //* Array
        Object obj = new Object(); //* Object

        System.out.println("Name: " + name);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Object: " + obj);
    }
}
