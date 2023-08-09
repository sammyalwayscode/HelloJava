import java.util.Scanner;

public class UserCubeArea {
    public static void main(String[] args) {
        double a = 6;
        double b = 2;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your cube value:");
        double cube = userInput.nextDouble();

        double cubeArea = a * Math.pow(cube, b);
        System.out.println("The Area of The Cube is: " + cubeArea);
    }
}
