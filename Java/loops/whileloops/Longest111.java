import java.util.Scanner;

public class Longest111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scan.nextInt();
        int count = 0; 
        int length = 0; 
        while (n > 0){
            if (n % 2 == 1){
                count++;
            }
            else if (count > length){
                length = count;
                count = 0;
            }
            n = n/2;
        }
        System.out.println(length);
    }       
}
