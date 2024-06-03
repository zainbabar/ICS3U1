import java.util.Scanner;

public class AreaOfRectangles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Computer Aided Design Program");
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        int area = 0;
        int width = 0;
        int height = 0;
        int max = 0;
        do {
            System.out.println("enter x1");
            x1 = scan.nextInt();
            System.out.println("enter y1");
            y1 = scan.nextInt();
            System.out.println("enter x2");
            x2 = scan.nextInt();
            System.out.println("enter y2");
            y2 = scan.nextInt();
            width = Math.abs((x1 - x2));
            height = Math.abs((y1 - y2));
            area = width * height;
            System.out.println("width: " + width);
            System.out.println("height: " + height);
            System.out.println("area: " + area);
            if (area > max){
                max = area;
            }
            System.out.println();
        } while (area > 0);
        System.out.println("finished");
        System.out.println("the max area was: " + max);
    }
}
