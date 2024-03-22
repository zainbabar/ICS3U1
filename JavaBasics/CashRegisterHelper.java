import java.util.Scanner;

class CashRegisterHelper {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of cents: ");
        int cents = scan.nextInt();
        
        // divide cents by 200 for # of toonies, remaineder is the # of cents left over
        int toonies = cents / 200;
        int remainingCentsAfterToonies = cents % 200;
        
        int loonies = remainingCentsAfterToonies / 100;
        int remainingCentsAfterLoonies = remainingCentsAfterToonies % 100;
        
        int quarters = remainingCentsAfterLoonies / 25;
        int remainingCentsAfterQuarters = remainingCentsAfterLoonies % 25;
        
        int dimes = remainingCentsAfterQuarters / 10;
        int remainingCentsAfterDimes = remainingCentsAfterQuarters % 10;
        
        int nickels = remainingCentsAfterDimes / 5;
        
        
        System.out.println("Toonies: " + toonies);
        System.out.println("Loonies: " + loonies);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
    }

}
