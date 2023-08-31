import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter valueOne");
        int valueOne = userInput.nextInt();
        System.out.println("Enter valueTwo:");
        int valueTwo = userInput.nextInt();

        if (valueOne > valueTwo) {
            System.out.println(valueOne);
        } else {
            System.out.println(valueTwo);
        }
    }
}
