import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(1, 20);
        int n;
        int i = 0;
        boolean end = false; 
        do {
            System.out.println("enter a nubmer between 1 and 20: ");
            n = scan.nextInt();
            if (n > r){
                System.out.println("too high");
            }
            else if (n < r){
                System.out.println("too low");
            }
            i++;
        } while (i < 5);
    }
}
