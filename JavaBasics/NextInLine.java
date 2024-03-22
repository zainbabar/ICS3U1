import java.util.Scanner;

class NextInLine{
    public static void main (String[] args){
      Scanner scan = new Scanner( System.in );
      System.out.println("Enter the age of the first kid: ");
      int inData = scan.nextInt();
      int age1 = inData;
      System.out.println("Enter the age of the second kid kid: ");
      inData = scan.nextInt();
      int age2 = inData;
      int ageDiff = age2 - age1;
      int age3 = age2 + ageDiff;
     
      
      System.out.println("The oldest kid is " + age3 + " years old." );  
    }
}
