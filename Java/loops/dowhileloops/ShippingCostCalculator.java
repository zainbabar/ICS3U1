import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight;
        do {
            System.out.println("weight of order");
            weight = scan.nextInt();
            if (weight <= 10){
                System.out.println("shipping cost: $3.00");
            }
            else {
                double cost = ((weight - 10) * 0.25) + 3.00;
                System.out.println("shipping cost: $" + cost);
            }
        } while (weight > 0);
    } 
}
