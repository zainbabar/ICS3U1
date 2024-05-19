import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double fmiles, mpg, imiles;
        while (true){
            System.out.println("initial miles");
            imiles = scan.nextInt();
            if (imiles < 0){
                System.out.println("bye");
                break;
            }
            System.out.println("final miles");
            fmiles = scan.nextInt();
            System.out.println("gallons");
            double gallons = scan.nextInt();
            mpg = (fmiles - imiles) / gallons;
            System.out.println("mpg: " + mpg);
            System.out.println("\n");
        }
        scan.close();
    }
}
