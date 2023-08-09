import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try (Scanner keyboardInput = new Scanner(System.in)) {
            System.out.print("Enter Your Name:");
            String name = keyboardInput.nextLine();
            System.out.print("Enter Your Age:");
            int age = keyboardInput.nextInt();

            System.out.println("Hello " + name + " !!!");
            System.out.println("You Are " + age + " years old");
        }
    }
}
