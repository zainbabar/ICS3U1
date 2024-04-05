import java.util.Scanner;

public class CakeProblemReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of eggs: ");
        int eggs = scan.nextInt() / 3;

        System.out.println("Enter the amount of flour: ");
        int flour = scan.nextInt() / 2;

        System.out.println("Enter the amount of milk: ");
        int milk = scan.nextInt();
        
        if (eggs < flour && eggs < milk){
            System.out.println("You can make " + eggs + " cake(s)");
        }

        else  if (milk < flour && milk < eggs){
            System.out.println("You can make " + milk + " cake(s)");
        }

        else if (flour < milk && flour < eggs){
            System.out.println("You can make " + flour + " cake(s)");
        }
    }
}