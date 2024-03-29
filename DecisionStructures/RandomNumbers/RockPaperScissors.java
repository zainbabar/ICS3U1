import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice (r = Rock, p = Paper, s = Scissors)");
        String input = scan.next().toLowerCase();

        String computerChoice;
        Random rand = new Random();
        int num = rand.nextInt(3);
        if (num == 0){
            computerChoice = "r";
        }
        else if (num == 1){
            computerChoice = "p";
        }
        else  {
            computerChoice = "s";
        }

        System.out.println("Computer's choice: " + computerChoice);
        System.out.println("Your throw: " + input);

        // if same then tie 

        if (input.equals(computerChoice)){
            System.out.println("It's a tie!");
        }
        else if (input.equals("r")){
            // if not same then check who wins if computer chooses p then computer wins if person chooses s then person wins
            if (computerChoice.equals("p")){
                System.out.println("Computer wins!");
            }
            else {
                System.out.println("You win!");
            }
        }
        else if (input.equals("p")){
            if (computerChoice.equals("s")){
                System.out.println("Computer wins!");
            }
            else {
                System.out.println("You win!");
            }
        }
        else if (input.equals("s")){
            if (computerChoice.equals("r")){
                System.out.println("Computer wins!");
            }
            else {
                System.out.println("You win!");
            }
        }
        else {
            System.out.println("Invalid input.");
        }
        
        
        

        


    }    
}
