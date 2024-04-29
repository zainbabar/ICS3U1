import java.util.Scanner;

public class DegreesToRadians {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the angle in degrees: ");
        double angle = scan.nextDouble();
        System.out.println("There are " + Math.toRadians(angle) + " radians in " + angle + " degrees.");
    }
}
