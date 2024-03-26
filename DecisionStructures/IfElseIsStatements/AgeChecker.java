
import java.util.Scanner;
class AgeChecker {
  public static void main (String[] args ) {
    Scanner scan = new Scanner (System.in);
    int age = 0;
    System.out.println("How old are you?");
    age = scan.nextInt();
    scan.close();

    //you'll need to nest the if else statements
    if ( age >= 18){
        System.out.println("You can vote.");
        //give appropriate feedback - You are a time traveller!!!
    }
    else if ( age >= 0) {
        System.out.println("Too young to vote!!");
    }

    else if ( age < 0) {
        System.out.println("You are a time traveller!!!");
    }
  }
}