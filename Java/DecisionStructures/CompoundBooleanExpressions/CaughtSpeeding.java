import java.util.Scanner;

public class CaughtSpeeding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your speed:");
        int speed = scan.nextInt();
        System.out.println("Is it your birthday? (yes/no)");
        String birthday = scan.next();

        if (birthday.equals("yes")) {
            speed -= 5;
        }

        if (speed <= 60) {
            System.out.println("no ticket");
        } else if (speed <= 80) {
            System.out.println("small ticket");
        } else {
            System.out.println("big ticket");
        }
    }
}