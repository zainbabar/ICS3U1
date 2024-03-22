import java.util.Scanner;

class tastyTypecasting{
    public static void main (String[] args){
      Scanner scan = new Scanner( System.in );
      System.out.println("Enter the side length of the pizza: ");
      double inData = scan.nextDouble();
      double area = inData * inData;
      double fed = (int) area/100;
     
      
      System.out.print("The area of the pizza is " + area + " cm squared - it can feed " + fed + " people" );  
    }
}
