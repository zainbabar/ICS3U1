import java.util.Scanner;

public class First4Last4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String s = scan.nextLine();
        
        int l = s.length();

        String l4 = s.substring(l - 4, l);
        String f4 = s.substring(0, 4);


        System.out.println("First four: " + f4);
        System.out.println("Last four: " + l4);
    }
}
    