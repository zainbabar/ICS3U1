import java.util.Scanner;

public class SquirrelTrouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is squirrel a smiling?");
        boolean a = scan.nextBoolean();
        SquirrelTrouble object = new SquirrelTrouble();

        System.out.println("Is squirrel b smiling?");
        boolean b = scan.nextBoolean();

        System.out.println("are we in trouble");
        System.out.println(object.trouble(a, b));
    }

    public boolean trouble(boolean a, boolean b){
        if (a == true && b == true || a == false && b == false){
            return false;
        }
        return false; 
    }
}
