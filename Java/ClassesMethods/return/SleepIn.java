import java.util.Scanner;

public class SleepIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it a weekday");
        boolean isWeekDay = scan.nextBoolean();
        System.out.println("Is it a vacation");
        boolean isVacation = scan.nextBoolean();
        SleepIn object = new SleepIn();
        System.out.println("Can we sleep in?");
        System.out.println(object.sleepIn(isWeekDay, isVacation));
    }
    public boolean sleepIn(boolean weekDay, boolean vacation) {
        //add an if statement to check if we can sleep in
        if (weekDay == false || vacation == true ){
            return true;
        }
        return false;
    }
}

