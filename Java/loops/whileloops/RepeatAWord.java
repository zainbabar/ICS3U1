import java.util.Scanner;

public class RepeatAWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String s = scan.nextLine();
        int i = 0;
        System.out.println("\n");
        while (i < s.length()){
            System.out.println(s);
            i++;
        }
    }
}
