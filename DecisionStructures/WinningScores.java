import java.util.Scanner;

public class WinningScores {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the amount of 3 point shots for Apples: ");
            int apples3point = scan.nextInt();
        
        System.out.println("Enter the amount of 2 point shots for Apples: ");
            int apples2point = scan.nextInt();

        System.out.println("Enter the amount of 1 point free throws shots for Apples: ");
            int apples1point = scan.nextInt();

        System.out.println("Enter the amount of 3 point shots for Bananas: ");
            int bananas3point = scan.nextInt();

        System.out.println("Enter the amount of 2 point shots for Bananas: ");
            int bananas2point = scan.nextInt();

        System.out.println("Enter the amount of 1 point free throw shots for Bananas: ");
            int bananas1point = scan.nextInt();

        int totalApplesPoints = apples3point + apples2point + apples1point;
        int totalBananasPoints = bananas3point + bananas2point + bananas1point;

        if ( totalApplesPoints > totalBananasPoints){
            System.out.println("Team Apples Wins");
        }

        else {
            if (totalApplesPoints == totalBananasPoints)
            System.out.println("It's a tie");

            else{

            System.out.println("Team Bananas Wins");
            }
        }
    }   
}
