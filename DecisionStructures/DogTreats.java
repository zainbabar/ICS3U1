import java.util.Scanner;
class DogTreats {
  public static void main (String[] args ) {
    Scanner scan = new Scanner (System.in);
    int noSmallTreats=0, noMediumTreats=0, noLargeTreats=0, happinessScore=0;
    System.out.println("How many small treats did Barley get?");
    noSmallTreats = scan.nextInt();
    
    System.out.println("How many medium treats did Barley get?");
    noMediumTreats = scan.nextInt();
   
    System.out.println("How many large treats did Barley get?");
    noLargeTreats = scan.nextInt();
    //read in the number of medium treats and then large treats
    scan.close();

    //calculate the hapinessScore
    happinessScore = noSmallTreats * 1 + noMediumTreats * 2 + noLargeTreats * 3;

    //check if the happinessScore is greater than 10
    if ( happinessScore > 10){
        System.out.println("Barley is happy!");
	//give appropriate feedback - Barley is happy!
    }
    else{
        System.out.println("Barley is sad :(");
	//give appropriate feedback - Barley is happy!
    }
  }
}
