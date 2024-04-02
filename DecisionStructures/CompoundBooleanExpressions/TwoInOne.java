

import java.util.Scanner;

public class TwoInOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        System.out.println("Enter the third number:");
        int c = scan.nextInt();

        if (a + b == c || a + c == b || b + c == a) {
            System.out.println("Two of the numbers add up.");
        } else {
            System.out.println("None of the numbers add up.");
        }
    }
}
