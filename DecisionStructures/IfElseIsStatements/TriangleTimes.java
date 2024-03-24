import java.util.Scanner;

public class TriangleTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first angle:");
        double angle1 = scanner.nextInt();

        System.out.println("Enter the second angle:");
        double angle2 = scanner.nextInt();

        System.out.println("Enter the third angle:");
        double angle3 = scanner.nextInt();

        scanner.close();

        double angleSum = angle1 + angle2 + angle3;

        if (angleSum > 180){
            System.out.println("Error.");
        } else if (angle1 == angle2 && angle2 == angle3){
            System.out.println("The triangle is equaliateral.");
        } else if (angle1 == angle2 || angle2 == angle3 ){
            System.out.println("The triangle is isosceles.");
        }else if (angle1 != angle2 && angle2 != angle3){
            System.out.println("The triangle is scalene.");
        }
    }
}