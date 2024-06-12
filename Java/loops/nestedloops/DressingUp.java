import java.util.Scanner;

public class DressingUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for height of the bowtie
        System.out.print("Enter the height of the bowtie (odd number): ");
        int height = scanner.nextInt();

        // Ensure height is an odd number
        if (height % 2 == 0) {
            System.out.println("Height must be an odd number.");
            return;
        }

        int mid = height / 2;

        // Upper part of the bowtie
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < height; j++) {
                if (j < i || j >= height - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the bowtie
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < height; j++) {
                if (j < i || j >= height - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
