import java.util.Scanner;
import java.util.Random;

public class MathTutor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1u = (10 - 1 + 1) * Math.random() + 1;
        double num2u = (10 - 1 + 1) * Math.random() + 1;
        double operator1 = (4 - 1 + 1) * Math.random() + 1;
        int num1 = (int)num1u;
        int num2 = (int)num2u;
        int operator = (int)operator1;
        // 1 = +, 2 = -, 3 = *, 4 = /

 

        if (operator == 1){
            System.out.println("What is " + num1 + " + " + num2 + "?");
            int answer = num1 + num2;
            int guess = scan.nextInt();
            
            if (answer == guess){
                System.out.println("Correct!");
            }
            
            else {
                System.out.println("Incorrect! The Correct answer is" + answer + ".");
            }
        }

        else if (operator == 2){
            System.out.println("What is " + num1 + " - " + num2 + "?");
            int answer = num1 - num2;
            int guess = scan.nextInt();
            
            if (answer == guess){
                System.out.println("Correct!");
            }
            
            else {
                System.out.println("Incorrect! The Correct answer is" + answer + ".");
            }
        }
    
        else if (operator == 3){
            System.out.println("What is " + num1 + " * " + num2 + "?");
            int answer = num1 * num2;
            int guess = scan.nextInt();
            
            if (answer == guess){
                System.out.println("Correct!");
            }
            
            else {
                System.out.println("Incorrect! The Correct answer is" + answer + ".");
            }
        }
            
        else if (operator == 4){
            System.out.println("What is " + num1 + " / " + num2 + "?");
            int answer = num1 / num2;
            int guess = scan.nextInt();
            
            if (answer == guess){
                System.out.println("Correct!");
            }
            else {
                System.out.println("Incorrect! The Correct answer is " + answer + ".");
            }

            scan.close();

        } 
    }
}



