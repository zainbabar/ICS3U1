
import java.util.Scanner;

public class Stages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
      
        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.close();

        if (age > 18) {
            System.out.println("You must be an adult");
        }

        else if (age > 12) {
            System.out.println("You must be a teen");
        }

        else if (age > 10){
            System.out.println("You must be a preteen");
        }

        else if (age > 5){
            System.out.println("You must be a child");
        }

        else if (age > 0){
            System.out.println("You must be a toddler");
        }
    }
}
