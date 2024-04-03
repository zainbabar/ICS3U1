import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = (6 - 1 + 1) * Math.random() + 1;
        double b = (6 - 1 + 1) * Math.random() + 1;
        int randomNum1 = (int)a;
        int randomNum2 = (int)b;

        int sum = randomNum1 + randomNum2;

        if (sum == 7){
            a = (6 - 1 + 1) * Math.random() + 1;
            b = (6 - 1 + 1) * Math.random() + 1;
            randomNum1 = (int)a;
            randomNum2 = (int)b;
    
            sum = randomNum1 + randomNum2;
        }

        System.out.println("Hi or Lo?");
        String guess = scan.nextLine();
        if (guess.equals("Hi") && sum > 7){
            System.out.println("Correct! The sum is " + sum);
        }
        else if (guess.equals("Lo") && sum < 7){
            System.out.println("Correct! The sum is " + sum);
        }
        else{
            System.out.println("Incorrect! The sum is " + sum);
        }
    }
}
