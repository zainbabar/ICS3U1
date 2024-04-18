package Java.DecisionStructures.IfAndIfElseStatements;
import java.util.Scanner;
class Yum {
  public static void main (String[] args ) {
    Scanner scan = new Scanner (System.in);
    int noPancakes = 0;
    System.out.println("How many pankcakes did you eat?");
    noPancakes = scan.nextInt();
    scan.close();
    //ask the user to enter the number of pancakes
    //read in this number in the variables noPancakes
    if ( noPancakes >= 0) {

      if ( noPancakes < 3){
          System.out.println("Still hungry!!!!");
          //give appropriate feedback - Still hungry!!!
      }
      if ( noPancakes >= 3){
          System.out.println("Yum!!!");
      }
          //give appropriate feedback - Yum!!!
   
        }
        else {
          System.out.println("You can't eat negative pancakes!!!");
      }  
    }
}
  
