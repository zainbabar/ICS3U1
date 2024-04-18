import java.util.Scanner;

public class AreaOfACircle {
    public static void main (String[] args){
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter the radius of the circle: ");
        int radius = scan.nextInt();
        double area = radius * radius * Math.PI;
        
       
        
        System.out.print("The area of the circle is " + area + " cm squared.");  
    }
}
  

