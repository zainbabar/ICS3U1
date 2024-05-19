import java.util.Scanner;

public class LastOneAround {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A WORD: ");
        String s = scan.nextLine();
        LastOneAround object = new LastOneAround();
        System.out.println(object.lastOneAround(s));
    }
    public String lastOneAround(String s){
        int x = s.length();
        char c = s.charAt(x - 1);
        return c + s + c;
    }
}
