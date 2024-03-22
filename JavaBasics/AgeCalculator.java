import java.util.Scanner;

class AgeCalculator{
    public static void main (String[] args){
      Scanner scan = new Scanner( System.in );
      System.out.println("What is your first name: ");
        String firstName = scan.next();
      System.out.println("What is your last name: ");
        String lastName = scan.next();
      System.out.println("What year were you born in: ");
        int birthYear = scan.nextInt();
      System.out.println("What is the current year:");
        int currentYear = scan.nextInt();
      int age = currentYear - birthYear;
      System.out.println("Greetings " + firstName + " " + lastName + ". You are " + age + " years old.");
    }
}
