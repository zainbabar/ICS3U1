
import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("How many gallons does the tank hold?");
            double tankSize = scan.nextInt();

        System.out.println("What percent full is the tank");
            double tankReading = scan.nextInt();
            

        System.out.println("What is the miles per gallon of the tank?");
            int mpg = scan.nextInt();

        double tankAmount = tankSize * (tankReading / 100);
        
        double range = tankAmount * mpg;

        if ( range > 200){
            System.out.println("Safe to proceed.");

        }

        else {
            System.out.println("Get gas!!!!");
        }
    }
}


