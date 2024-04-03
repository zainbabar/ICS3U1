import java.util.Scanner;

public class SameLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        
        int a = scan.nextInt();

        System.out.println("Enter b: ");
        int b = scan.nextInt();

        System.out.println("Enter c: ");
        int c = scan.nextInt();


        if (c % 10 == b % 10 || a % 10 == c % 10 || a % 10 == b % 10){
            System.out.println("true");
        }

        else {
            System.out.println("false");
        }
    }
}
