package JavaBasics.Day4;

public class CallByValue {
    public static void main(String[] args) {

        //TODO: Call By Value
        //* In Java, arguments are always passed by value, meaning that a copy of the value is passed to the method.


        int x = 50;
        changeValue(x);
        System.out.println("Value of x: "+x); //* x is remains 50

    }

    static  void changeValue(int num) {
        num = num + 10;
    }
}
