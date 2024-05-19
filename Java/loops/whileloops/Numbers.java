import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the staring value");   
        int a = scan.nextInt();
        System.out.println("enter the ending  value");   
        int b = scan.nextInt();
        
        System.out.println("the numbers between the starting and ending value are");
        while (a <= b){
            System.out.println(a);
            a++;
        }
    }   
}
