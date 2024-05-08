import java.util.Scanner;

public class stringsfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        
        System.out.println("Enter some text: ");
        String s = scan.nextLine();
        int l = s.length();
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        String t2s = s.substring(2, 7);
        String end = s.substring(2, l);
        String stripped = s.trim();
        String replacedAll = s.replaceAll("i", "xx");
        String replaced = s.replaceFirst("cr", "aa");

        System.out.println
        (
            "The length is: " + l + "\n" + 
            "Uppercase: " + upper + "\n" +
            "Lowercase: " + lower + "\n" +
            "Letters from 3 to 6: " + t2s + "\n" +
            "Trimmed: " + stripped + "\n" +
            "All \"i\" are replaced with \"xx\": " + replacedAll + "\n" +
            "First \"cr\" is replaced with \"aa\": " + replaced               
        );
    }
}
