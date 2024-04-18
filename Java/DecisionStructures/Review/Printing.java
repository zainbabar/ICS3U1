package Java.DecisionStructures.Review;
import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of copies to be printed: ");
        double copies = scan.nextInt();

        double pricePer = 0;

        if (0 <= copies && copies <= 99){
            pricePer = 0.3;
        }

        else if (100 <= copies && copies <= 499){
            pricePer = 0.28;
        }
        
        else if (500 <= copies && copies <= 749){
            pricePer = 0.27;
        }

        else if (750 <= copies && copies <= 1000){
            pricePer = 0.26;
        }

        else {
            pricePer = 0.25;
        }

        System.out.println("Price per copy is: $" + pricePer);

        double totalCost = copies * pricePer;
        
        totalCost = totalCost * 100 / 100;
        
        System.out.println("Total cost is: $" + totalCost);
    }
}
