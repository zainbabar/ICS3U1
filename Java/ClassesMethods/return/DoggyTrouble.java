import java.util.Scanner;

public class DoggyTrouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Is the dog parking");
        boolean bark = scan.nextBoolean();
        System.out.println("What is the time");
        int time = scan.nextInt();

        DoggyTrouble object = new DoggyTrouble();

        System.out.println(object.trouble(time, bark));


    }
    public boolean trouble(int time, boolean bark){
        if (bark == true && time > 20 || time < 7){
            return true;
        }
        return false;
    }
}
