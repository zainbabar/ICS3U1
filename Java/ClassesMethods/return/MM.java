import java.util.Scanner;

public class MM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String s = scan.nextLine();
        MM object = new MM();
        System.out.println(object.check(s));
    }
    public boolean check(String s){
        int x = s.indexOf('m'); 
        if (s.length() > x + 1){
            if (s.charAt(x + 1) == 'm'){
                return true;
            }
        } 
    return false;
    }
}

