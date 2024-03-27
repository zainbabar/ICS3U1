import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double randomNum = (20 - 1 + 1) * Math.random() + 1;
        int randomNumRounded = (int)randomNum;


        System.out.println("Enter a number between 1 and 20:");
        int guess = scan.nextInt();

        System.out.println("Computer's Number: " + randomNumRounded);
        System.out.println("Player's Number: " + guess);

        if (guess == randomNumRounded){
            System.out.println("You won!");
        } else {
            System.out.println("Better luck next time.");
        }
    }
}
