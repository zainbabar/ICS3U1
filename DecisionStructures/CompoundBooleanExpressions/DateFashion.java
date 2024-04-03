import java.util.Scanner;

public class DateFashion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your stylishness (0-10):");
        int yourStyle = scan.nextInt();
        System.out.println("Enter your date's stylishness (0-10):");
        int dateStyle = scan.nextInt();

        if (yourStyle <= 2 || dateStyle <= 2) {
            System.out.println("no");
        } 
        else if (yourStyle >= 8 || dateStyle >= 8) {
            System.out.println("yes");
        } 
        else {
            System.out.println("maybe");
        }
    }
}