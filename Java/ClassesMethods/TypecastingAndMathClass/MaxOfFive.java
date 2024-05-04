import java.util.Scanner;

public class MaxOfFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the first number: ");
        int b = scan.nextInt();
        System.out.println("Enter the first number: ");
        int c = scan.nextInt();
        System.out.println("Enter the first number: ");
        int d = scan.nextInt();
        System.out.println("Enter the first number: ");
        int e = scan.nextInt();

        System.out.println("The max num is " + Math.max(a, Math.max(b, Math.max(c, Math.max(d, e)))));
    }
}
