import java.util.Scanner;

public class GreenTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        
        int a = scan.nextInt();

        System.out.println("Enter b: ");
        int b = scan.nextInt();

        System.out.println("Enter c: ");
        int c = scan.nextInt();
        
        if (a == b && a == c){
            System.out.println("20");
        }

        else if (a == b || a == c || b == c) {
            System.out.println("10");
        }

        else {
            System.out.println("0");
        }
    }
}
