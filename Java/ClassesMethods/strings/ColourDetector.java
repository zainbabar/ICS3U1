import java.util.Scanner;

public class ColourDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = scan.nextLine();
        

        if (s.startsWith("red") || s.startsWith("blue") || s.startsWith("green")){
            System.out.println("color");
        }
        else{
            System.out.println("no color");
        }
    }
}
