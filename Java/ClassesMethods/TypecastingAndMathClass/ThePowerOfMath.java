import java.util.Scanner;

public class ThePowerOfMath{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the base number:");
        double x = scan.nextDouble();
        System.out.println("What is the exponent:");
        double n = scan.nextDouble();
        System.out.println(x + " to the power of " + n + " is " + (Math.pow(x, n)));
    }
}