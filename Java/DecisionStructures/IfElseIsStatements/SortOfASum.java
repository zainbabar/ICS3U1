package Java.DecisionStructures.IfElseIsStatements;

import java.util.Scanner;
public class SortOfASum {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = 0;
        int b = 0;

        System.out.println("What is the first number?");
        a = scan.nextInt();

        System.out.println("What is the second number?");
        b = scan.nextInt();

        int sum = a + b;

        if (sum >= 10) {
            if (sum <= 19){
                System.out.println("forbidden sum: 20");
            } else {
                System.out.println("sum: " + sum);
            }
        } else {
            System.out.println("sum: " + sum);
        }
    }
}
