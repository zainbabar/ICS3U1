import java.util.Scanner;

public class LetsParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of pizzas:");
        int pizzas = scan.nextInt();
        System.out.println("Enter the number of cakes:");
        int cakes = scan.nextInt();

        if (pizzas < 5 || cakes < 5) {
            System.out.println("bad");
        } else if (pizzas >= 2 * cakes || cakes >= 2 * pizzas) {
            System.out.println("great");
        } else {
            System.out.println("good");
        }
    }
}