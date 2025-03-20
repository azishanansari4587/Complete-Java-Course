package JavaBasics.Day3;

public class IfElseIfLadder {

    public static void main(String[] args) {

        //* TODO if-else-if ladder: It is used to check multiple conditions at the same time.

        int marks = 70;

        if (marks >= 80) {
            System.out.println("You got A grade.");
        } else if (marks >= 60) {
            System.out.println("You got B grade.");
        } else if (marks >= 40) {
            System.out.println("You got C grade.");
        } else {
            System.out.println("You got D grade.");
        }
    }
}
