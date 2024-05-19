import java.util.Scanner;

public class EvenPrompter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an even number");
        int n = scan.nextInt();
        if (n % 2 == 1){
            do {
                System.out.println("please enter an even number");
                n = scan.nextInt();
            } while (n % 2 == 1);
        }
    }
}
