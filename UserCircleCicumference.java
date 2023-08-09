import java.util.Scanner;

public class UserCircleCicumference {
    public static void main(String[] args) {
        double a = 2;
        double pie = 3.142;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the Radius Of The Circle: ");
        double Radius = userInput.nextInt();

        double CircleCicumference = a * pie * Math.pow(Radius, a);
        System.out.println("The Circumference of the Circle is: " + CircleCicumference);
    }
}
