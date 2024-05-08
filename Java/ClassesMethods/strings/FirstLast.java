import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = scan.nextLine();
        
        int length = s.length();
        
        char first = s.charAt(0);

        char last = s.charAt(length - 1);

        System.out.println("The first charachter is: " + first);
        System.out.println("The last charachter is: " + last);


    }
}

