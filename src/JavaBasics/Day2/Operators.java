package JavaBasics.Day2;

public class Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //? 🚀 Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //? 🚀 Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("c += 5 = " + c);
        c -= 5;
        System.out.println("c -= 5 = " + c);
        c *= 5;
        System.out.println("c *= 5 = " + c);
        c /= 5;
        System.out.println("c /= 5 = " + c);
        c %= 5;
        System.out.println("c %= 5 = " + c);

        //? 🚀 Comparison Operators
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));

        //? 🚀 Logical Operators
        System.out.println("a && b = " + ((a > 5) && (b < 5)));
        System.out.println("a || b = " + ((a > 5) || (b < 5)));
        System.out.println("!a = " + (!(a == 5)));

        //? 🚀 Bitwise Operators
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        //? 🚀 Shift Operators
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a >>> 2 = " + (a >>> 2));

        //? 🚀 Ternary Operators
        System.out.println("a > b ? a : b = " + (a > b ? a : b));

        //? 🚀 Unary Operators
        System.out.println("++a = " + (++a));
        System.out.println("--a = " + (--a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));

    }
}
