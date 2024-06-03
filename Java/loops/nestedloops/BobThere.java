import java.util.Scanner;

public class BobThere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BobThere obj = new BobThere();
        String s = scan.nextLine();
        System.out.println(obj.bobThere(s));
    }

    public boolean bobThere(String s){
        int n = s.length();
        for (int i = 0; i < n; i++){
            if (s.charAt(i) == 'b' && s.charAt(i + 2) == 'b'){
                return true;
            }
        }
        return false;
    }
}
