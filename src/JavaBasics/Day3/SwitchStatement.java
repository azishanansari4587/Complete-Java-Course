package JavaBasics.Day3;

public class SwitchStatement {
    public static void main(String[] args) {

        //* TODO switch statement: The switch statement is used when a variable is compared with multiple values (cases).

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
