import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the package:");
        int length = scan.nextInt();
        System.out.println("Enter the width of the package:");
        int width = scan.nextInt();
        System.out.println("Enter the height of the package:");
        int height = scan.nextInt();

        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }
    }
}