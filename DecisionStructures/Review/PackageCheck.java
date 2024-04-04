import java.util.Scanner;

public class PackageCheck {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter the package weight in kilograms: ");
        int weight = scan.nextInt();
        
        System.out.println("Enter the package length in centimeters");
        int length = scan.nextInt();
        
        System.out.println("Enter the package width in centimeters");
        int width = scan.nextInt();
        
        System.out.println("Enter the package height in centimeters");
        int height = scan.nextInt();

        int volume = length * width * height;

        if (volume > 100000 && weight > 27){
            System.out.println("Too heavy and large");
        }

        else if (volume > 100000){
            System.out.println("Too large");
        }

        else if (weight > 27) {
            System.out.println("Too heavy");
        }

        else {
            System.out.println("Meets requirments.");
        }
    }
}
