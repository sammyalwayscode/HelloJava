import java.util.Scanner;

public class UserTriangleArea {
    public static void main(String[] args) {
        double a = 2;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the breath of your Triangle: ");
        double Breath = userInput.nextDouble();
        System.out.print("Enter the Height of your Triangle ");
        double Height = userInput.nextDouble();

        double Area = Breath * Height / a;
        System.out.println("The Area Of The Triangle is: " + Area);
    }
}
