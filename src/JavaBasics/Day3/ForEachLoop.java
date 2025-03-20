package JavaBasics.Day3;

public class ForEachLoop {
    public static void main(String[] args) {

        //* TODO for-each loop: It is used to iterate over an array or a collection of elements.
        int[] numbers = {1, 2, 3, 4, 5};

        for (int num : numbers) {
            System.out.println("Number: "+num);
        }
    }
}
