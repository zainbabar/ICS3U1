import java.util.Scanner;

public class HasMmm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = scan.nextLine();

        if (s.substring(0, 3).equals("mmm") || s.substring(1, 4).equals("mmm") ){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
