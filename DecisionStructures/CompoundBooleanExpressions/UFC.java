

import java.util.Scanner;

public class UFC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the fighter: ");
        String fighterName = scan.nextLine();
       System.out.println("Enter the weight of the fighter: ");
        int fighterWeight = scan.nextInt();

        if (fighterWeight >= 145 && fighterWeight < 155){
            System.out.println(fighterName + " is in the Lightweight division.");
        }
        else if (fighterWeight >= 155 && fighterWeight < 170){
            System.out.println(fighterName + " is in the Welterweight division.");
        }
        else if (fighterWeight >= 170 && fighterWeight < 185){
            System.out.println(fighterName + " is in the Middleweight division.");
        }
        else if (fighterWeight >= 185 && fighterWeight < 205){
            System.out.println(fighterName + " is in the Light Heavyweight division.");
        }
        else if (fighterWeight >= 205 && fighterWeight <=265){
            System.out.println(fighterName + " is in the Heavyweight division.");
        }
        else {
            System.out.println("Invalid weight.");
        }
    }
}
