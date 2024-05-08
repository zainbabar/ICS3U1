import java.util.Scanner;

public class FrontAndBack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = scan.nextLine();
        int l = s.length();
        if (s.substring(0, 2).equals(s.substring(l - 2))){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
