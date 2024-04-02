import java.util.Scanner;

public class MultipleOf3Or5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = scan.nextInt();

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("false");
        }

        else if (a % 3 == 0 || a % 5 == 0){
            System.out.println("true");
        }
    }
}