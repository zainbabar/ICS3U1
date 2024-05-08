import java.util.Scanner;

public class IsTeen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age1=0, age2=0, age3=0;
        //collect from the user with a Scanner age1, age2, age3.
        
        System.out.println("Enter the first age"); 
        age1 = scan.nextInt();
        System.out.println("Enter the second age");
        age2 = scan.nextInt();
        System.out.println("Enter the third age");
        age3 = scan.nextInt();
        
        IsTeen object = new IsTeen();
        System.out.println("Are any of the ages a teen?");
        System.out.println(object.isTeen(age1, age2, age3));
    }    

    public boolean isTeen(int firstAge, int secondAge, int thirdAge) {
        boolean toReturn = false;
        //add an if statement to check if any of the three parameters is a teen number
        if ((firstAge > 13 && firstAge < 19) || (secondAge > 13 && secondAge < 19) || (thirdAge > 13 && thirdAge < 19)){
            toReturn = true;
        }
        return toReturn;
    }
}