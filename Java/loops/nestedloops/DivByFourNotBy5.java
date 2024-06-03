import java.util.Scanner;

public class DivByFourNotBy5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("enter a low value: ");
        int a = scan.nextInt();
        System.out.println();
        System.out.print("enter a high value: ");
        int b = scan.nextInt();
        System.out.println();
        System.out.println("nums divisible by 5 but not by 4");
        for (; a < b; a++){
            if (a % 4 == 0 && a % 5 != 0){
                System.out.print(a);
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
