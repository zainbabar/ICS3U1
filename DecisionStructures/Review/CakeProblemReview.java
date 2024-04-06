import java.util.Scanner;

public class CakeProblemReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cakes = 0;
        
        System.out.println("Enter the number of eggs: ");
        int eggs = scan.nextInt() / 3;

        System.out.println("Enter the amount of flour: ");
        int flour = scan.nextInt() / 2;

        System.out.println("Enter the amount of milk: ");
        int milk = scan.nextInt();

        scan.close();

        if (eggs < 3 || flour < 2 || milk < 1){
            System.out.println("You can make 0 cake(s).");
        } else if (eggs < flour && eggs < milk){
            cakes = eggs;
        } else  if (milk < flour && milk < eggs){
            cakes = milk;
        } else if (flour < milk && flour < eggs){
            cakes = flour;
        } else {  
            cakes = eggs;
        }
        System.out.println("You can make " + cakes + " cake(s)");
    }
}
