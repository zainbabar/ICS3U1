import java.util.Scanner;;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the farhenheit temprature");
        double f = scan.nextDouble();
        double c = 5.0/9.0 * (f - 32);
        System.out.println("The farhenheit temprature in celsius is " + c + " degrees.");
    }
}
