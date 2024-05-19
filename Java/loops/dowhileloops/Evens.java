import java.util.Scanner;

public class Evens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an int between 1 and 100: ");
        int n = scan.nextInt();
        Evens obj = new Evens();
        obj.EvenNumbs(n);
    }

    public void EvenNumbs(int n){
        System.out.println("\n");
        int x = 1;
        do {
            if (x % 2 == 0){
                System.out.println(x);
            }
            x++;
        } while (x < n);
    }
}
