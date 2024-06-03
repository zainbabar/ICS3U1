import java.util.Scanner;   

public class ISpeakTXTMSG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input;

        String words = "";

        String[] wordStrings;

        do {
            input = scan.nextLine();
            if (input.equals("CU")){
                words = words + " " + ("see you");
            }
            if (input.equals(":-)")){
                words = words + " " + ("I'm happy");
            }
            if (input.equals(":-()")){
                words = words + " " + ("I'm unhappy");
            }
            if (input.equals(";-)")){
                words = words + " " + ("wink");
            }
            if (input.equals(":-P")){
                words = words + " " + ("stick out my tounge");
            }
            if (input.equals("(~.~)")){
                words = words + " " + ("sleepy");
            }
            if (input.equals("TA")){
                words = words + " " + ("totally awesome");
            }
            if (input.equals("CCC")){
                words = words + " " + ("Canadian Computing Competition");
            }
            if (input.equals("CUZ")){
                words = words + " " + ("because");
            }
            if (input.equals("TY")){
                words = words + " " + ("thank-you");
            }
            if (input.equals("YW")){
                words = words + " " + ("you're welcome");
            }
        } while (!(input.equals("TTYL")));
        words = words + " " + ("talk to you later");

        wordStrings = words.split(" ");
        System.out.println(wordStrings);

        for (int i = 0; i < wordStrings.length; i++){
            if (wordStrings[i].equals("CU")){
                System.out.println("see you");
            }
            if (wordStrings[i].equals(":-)")){
                System.out.println("I'm happy");
            }
            if (wordStrings[i].equals(":-()")){
                System.out.println("I'm unhappy");
            }
            if (wordStrings[i].equals(";-)")){
                System.out.println("wink");
            }
            if (wordStrings[i].equals(":-P")){
                System.out.println("stick out my tounge");
            }
            if (wordStrings[i].equals("(~.~)")){
                System.out.println("sleepy");
            }
            if (wordStrings[i].equals("TA")){
                System.out.println("totally awesome");
            }
            if (wordStrings[i].equals("CCC")){
                System.out.println("Canadian Computing Competition");
            }
            if (wordStrings[i].equals("CUZ")){
                System.out.println("because");
            }
            if (wordStrings[i].equals("TY")){
                System.out.println("thank-you");
            }
            if (wordStrings[i].equals("YW")){
                System.out.println("you're welcome");
            }
        }
    }
}
