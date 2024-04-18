package Java.DecisionStructures.IfElseIsStatements;

import java.util.Scanner;

public class SpecialDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int day = 0;
        int month = 0;

        System.out.println("What is the month?");
        month = scan.nextInt();

        System.out.println("What is the day?");
        day = scan.nextInt();

        if (month == 2){
            if (day == 18) {
                System.out.println("Special");
            } else if (day >18) {
                System.out.println("After");
            } else if (day < 18) {
                System.out.println("Before");
            }
    
        } else if (month > 2) {
            System.out.println("After");
        } else if (month < 2) {
            System.out.println("Before");
        }    
    }
}