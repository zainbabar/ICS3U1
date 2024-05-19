import java.util.Scanner;

public class Prompter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a min value");
        int min = scan.nextInt();
        System.out.println("enter a max value");
        int max = scan.nextInt();
        int n;
        System.out.println("\n");
        do {
            System.out.println("enter a number between " + min + " and " + max + ": ");
            n = scan.nextInt();
        } while (n < max && n > min);
        System.out.println("\noutside the range! good bye!");
    }
}
