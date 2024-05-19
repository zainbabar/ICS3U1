import java.util.Scanner;

public class IcyAndHot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first temprature");
        int a = scan.nextInt();
        System.out.println("What is the first temprature"); 
        int b = scan.nextInt();

        IcyAndHot object = new IcyAndHot();
        System.out.println(object.test(a, b));
    }

    public boolean test(int a, int b){
        if (a < 0 || b < 0 && a > 100 ||b > 100){
            return true;
        }
        return false;
    }
}
