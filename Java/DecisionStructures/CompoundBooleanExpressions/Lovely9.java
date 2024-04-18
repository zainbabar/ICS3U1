
import java.util.Scanner;

    public class Lovely9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a == 9 || b == 9 || a + b == 9 || (a - b) == 9) {
                System.out.println("lovely");
            } else {
                System.out.println("not lovely");
            }
        }
    }

// does not account for -9