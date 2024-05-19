import java.util.Scanner;
class FacebookFriends {
    public static void main (String[] args ) {
    Scanner scan = new Scanner (System.in);
    String friendID = "";
    String message = "Hi";
    int count = 1;         
    while ( count <= 5 ) 
    {
        System.out.println("Enter ID"+count);
        friendID = scan.nextLine();
        message = message +" " + friendID;
        count++;
    }
    System.out.println( message+" "+"\nParty on Friday!" );
    }
}