package IfAndIfElseStatements;
import java.util.Scanner;
class OrderChecker {
  public static void main (String[] args ) {
    Scanner scan = new Scanner (System.in);
    int noBolts = 0;
    int noNuts = 0;
    int noWashers = 0;
    int price = 0;

    System.out.println("How many bolts are there");
        noBolts = scan.nextInt();

    System.out.println("How many nuts are there");
        noNuts = scan.nextInt();

    System.out.println("How many washers are there");
        noWashers = scan.nextInt();

    price = noBolts * 5 + noNuts * 3 + noWashers * 1;

    //ask the user to input the number of bolts and store it in noBolts

    //ask the user to input the number of nuts and store it in noNuts

    //ask the user to input the number of washers and store it in noWashers

    //calculate and output total price: price = noBolts*5 + noNuts*3 + ...

    //check if there are more bolts than nuts: 
    if (noBolts > noNuts){
        System.out.println("Check Order");
        //print out "Check Order"
    }

    System.out.println("Total Cost: " + price + " cents.");

  }
}