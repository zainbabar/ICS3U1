import java.util.Scanner;

public class MidLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = scan.nextLine();
        int l = s.length();
        int mid = l/2;
        if (l % 2 == 0){
            String ml = s.substring(mid - 1, mid + 1);
            System.out.println("The middle letters are: " + ml);
        }
        else {
            String ml = s.substring(mid - 1, mid + 2);
            System.out.println("The middle letters are: " + ml);
        }
    }
}
