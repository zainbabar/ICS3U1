package Java.DecisionStructures.Review;
import java.util.Scanner;

public class TeenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scan.nextInt();

        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        int c = a + b;

        if (a < 20 && a > 12 || b < 20 && b > 12 || c < 20 && c > 12){
            System.out.println("19");
        }
        else {
            System.out.println(c);
        }
    }
}