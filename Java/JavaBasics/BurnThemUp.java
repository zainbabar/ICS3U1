import java.util.Scanner;

class BurnThemUp{
    public static void main (String[] args){
      Scanner scan = new Scanner( System.in );
      System.out.println("How many pieces of cake have you eaten: ");
        double cake = scan.nextInt();
        double calories = cake * 225;
      double km = calories/100;
      
      
      System.out.println("You will need to run " + km + " km.");
    }
}

      