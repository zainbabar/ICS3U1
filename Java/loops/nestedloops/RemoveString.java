import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence");
        String s = scan.nextLine();
        System.out.println("enter a string");
        String r = scan.nextLine();
        RemoveString obj = new RemoveString();
        System.out.println(obj.removeString(s, r));
    }

    public String removeString(String s, String r){
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < s.length() - r.length(); j++){
                if (s.substring(j, j + r.length()).equals(r)){
                    String toReplace = s.substring(j, j + r.length());
                    s = s.replace(toReplace, "");
                }
            }
        }
        return s; 
    }
}
