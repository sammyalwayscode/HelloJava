import java.util.Scanner;

public class UserClassroomArea {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the Lenght of your Classroom:");
        int Lenght = userInput.nextInt();
        System.out.print("Enter the Breath of your ClassRoom:");
        int Breath = userInput.nextInt();

        int Area = Lenght * Breath;
        System.out.println("The Area of your ClassRoom is: " + Area);
    }
}
