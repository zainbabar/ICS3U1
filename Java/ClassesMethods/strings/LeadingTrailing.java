import java.util.Scanner;

public class LeadingTrailing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scan.nextLine();
        System.out.println("Enter an integer: ");
        int n = scan.nextInt();
    
        int l = s.length();    

        String a = s.substring(0, n);
        String b = s.substring(l - n, l);

        System.out.println(a + b);

    }
}
