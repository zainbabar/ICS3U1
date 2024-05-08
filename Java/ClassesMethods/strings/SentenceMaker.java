import java.util.Scanner;

public class SentenceMaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String s = scan.nextLine();

        String a = s.substring(0, 1);
        a = a.toUpperCase();
        String b = s.substring(1, s.length());
        System.out.println(a + b + ".");
    }
}
