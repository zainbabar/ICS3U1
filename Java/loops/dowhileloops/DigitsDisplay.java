import java.util.Scanner;

public class DigitsDisplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a positive int");
        String s = scan.nextLine();
        DigitsDisplay obj = new DigitsDisplay();
        obj.display(s);
    }
    public void display(String s){
        System.out.println("\n");
        int i = 0;
        do {
            System.out.println(s.charAt(i));
            i++;
        } while (i < s.length());
    }
}
