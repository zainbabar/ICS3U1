// CCC practice problem

import java.util.Scanner;

public class TriangleTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double angle1 = scanner.nextInt();

        double angle2 = scanner.nextInt();

        double angle3 = scanner.nextInt();

        scanner.close();

        double angleSum = angle1 + angle2 + angle3;

        if (angleSum != 180){
            System.out.println("Error");
        } else if (angle1 == angle2 && angle2 == angle3){
            System.out.println("Equilateral");
        } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3){
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}