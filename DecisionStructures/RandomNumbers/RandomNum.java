import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();
        
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();

        double randomNum = (num2 - num1 + 1) * Math.random() + num1; 

        int randomNumRounded = (int)randomNum;

        System.out.println("Random number between " + num1 + " and " + num2 + " is " + randomNumRounded);

        scan.close();    
    }
}
