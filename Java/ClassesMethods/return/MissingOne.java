import java.util.Scanner;

public class MissingOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");
        String a = scan.nextLine();

        MissingOne object = new MissingOne();

        
        System.out.println("enter an int");
        int b = scan.nextInt();
        System.out.println(object.missingOne(a, b));
    }
    public String missingOne(String s, int x){
        String a = s.substring(x + 1);
        String b = s.substring(0, x);
        return b + a;
    }
}

