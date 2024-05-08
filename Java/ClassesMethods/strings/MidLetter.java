import java.util.Scanner;

public class MidLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scan.nextLine();

        int l = s.length();

        if (l % 2 == 0){
            char mid = s.charAt((l/2) - 1);
            System.out.println("The middle charachter is: " + mid);
        }
        else {
            char mid = s.charAt(l/2);
            System.out.println("The middle charachter is: " + mid);
        }
    }
}
