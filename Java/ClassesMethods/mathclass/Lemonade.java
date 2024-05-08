import java.util.Scanner;

public class Lemonade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of water in cups");
        double w = scan.nextDouble() / 4.0;
        System.out.println("Enter the amount of lemon juice in cups");
        double l = scan.nextDouble() / 1.5;
        System.out.println("Enter the amount of sugar in cups");
        double s = scan.nextDouble(); 

        int c = (int) ((Math.min(w, Math.min(l, s))) * 6.5);
        int v  =(int) ((double)(c) * 0.005);
        System.out.println("You can make " + c + " cups of lemonde. " + "Each volunteer gets " + v + " cups." );

    }
}
