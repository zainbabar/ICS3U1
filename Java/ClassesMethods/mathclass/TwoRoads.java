import java.util.Scanner;

public class TwoRoads {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weigth limit for the bridge a: ");
        int a = scan.nextInt();
        System.out.println("Enter the weigth limit for the bridge b: ");
        int b = scan.nextInt();
        System.out.println("Enter the weigth limit for the bridge c: ");
        int c = scan.nextInt();
        System.out.println("Enter the weigth limit for the bridge d: ");
        int d = scan.nextInt();
        System.out.println("Enter the weigth limit for the bridge e: ");
        int e = scan.nextInt();
        scan.close();

        int x = Math.min(a, Math.min(b, c));
        int y = Math.min(d, e);
        System.out.println("The maximum weight is: " + Math.max(x, y));
    }
}
