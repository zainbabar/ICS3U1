import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the x coordiante");
        int x = scan.nextInt();

        System.out.println("Enter the y coordiante");
        int y = scan.nextInt();

        if (x == 0 || y == 0){
        System.out.println("The coordinates cannot be zero.");
        }
        
        if (x > 0){
            if (y > 0){
                System.out.println("The coordinates are in quadrant one.");
            }
            else if (y < 0){
                System.out.println("The coordinates are in quadrant four.");
            }
        }
        if (x < 0){
            if ( y > 0){
                System.out.println("The coordiantes are in quadrant two.");
            }
            else if (y < 0){
                System.out.println("The coordiantes are in quadrant three.");
            }
        }
    }
}