package JavaBasics.Day3;

public class DoWhileLoop {
    public static void main(String[] args) {

        //* TODO do-while loop: Executes at least once, then checks the condition.

        int i = 6;

        do {
            System.out.println("Iteration: "+i);
            i++;
        } while (i <= 5); //* Condition will be checked at the end
    }
}
