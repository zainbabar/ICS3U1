import java.util.Scanner;

public class ShuffleTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scan.nextLine();
        
        int l = s.length();

        String a = s.substring(0, 2); 

        String b = s.substring(2, l);

        System.out.println(b + a);
    }
}
