import java.util.Scanner;

public class OnlyPositive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an int");
        int x = scan.nextInt();

        while (x < 1){
            System.out.println("please enter a positive value!");
            x = scan.nextInt();
        }
        System.out.println("thank you!");
    }
}
