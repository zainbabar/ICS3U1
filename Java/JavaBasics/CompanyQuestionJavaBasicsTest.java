import java.util.Scanner;

public class CompanyQuestionJavaBasicsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double companyMonthlyRevenue;
        double moneyForOranges;
        int totalOrangesBought;
        double totalOrangesCost;
        int totalOrangesDollarsCostRounded;
        int totalOrangesChangeCostRounded;
        int change;

        System.out.println("What is our company monthly revenue");
        companyMonthlyRevenue = input.nextDouble();

        moneyForOranges = companyMonthlyRevenue * 0.60;

        totalOrangesBought = (int) (moneyForOranges / 0.55);

        totalOrangesCost = totalOrangesBought * 0.55;

        totalOrangesDollarsCostRounded = (int) totalOrangesCost;

        change = (int) ((moneyForOranges % 0.55) *100);

        // Round the change to the nearest cent
        totalOrangesChangeCostRounded = (int) ((totalOrangesCost - totalOrangesDollarsCostRounded) * 100);

        System.out.println("The amount of money to spend on oranges is " + totalOrangesDollarsCostRounded + " dollars and " + totalOrangesChangeCostRounded + " cents");
        System.out.println("You can buy " + totalOrangesBought + " oranges." );
        System.out.println("You have " + change + " cents left." );

    }
}
