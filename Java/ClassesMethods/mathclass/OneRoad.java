import java.util.Scanner;

public class OneRoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weigth limit for the bridge a: ");
        int a = scan.nextInt();
        System.out.println("Enter the weigth limit for the bridge b: ");
        int b = scan.nextInt();
        System.out.println("Enter the weigth limit for the bridge c: ");
        int c = scan.nextInt();

        System.out.println("The maximum weigth is: " + Math.min(a, Math.min(b, c)));
        
    }
}
