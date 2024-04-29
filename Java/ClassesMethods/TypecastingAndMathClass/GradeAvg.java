import java.util.Scanner;

public class GradeAvg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first grade?");
        double a = scan.nextDouble();
        System.out.println("What is the second grade?");
        double b = scan.nextDouble();
        System.out.println("What is the third grade?");
        double c = scan.nextDouble();
        System.out.println("What is the fourth grade?");
        double d = scan.nextDouble();
        System.out.println("What is the fifth grade?");
        double e = scan.nextDouble();

        double avg = (a + b + c + d + e) / 5;
        System.out.println("The average of the five marks are: " + avg);

    }
}
