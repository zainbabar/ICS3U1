import java.util.Scanner;
public class True10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if (num % 10 == 0 || num % 10 == 1 || num % 10 == 2) {
            System.out.println("True");
        } 
        
        else {
            System.out.println("False");
        }

    }
    
}
