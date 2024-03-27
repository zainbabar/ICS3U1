
import java.util.Scanner;
class SurfsUpPt3 {
  public static void main (String[] args ) {
   
    Scanner scan = new Scanner (System.in);
    
    int wavesHeight = 0;
    
    System.out.println("How big are the waves?");
        wavesHeight = scan.nextInt();
    
        scan.close();

    //check if the wavesHeight is greater than 6
        if (wavesHeight >= 6 ){
            //give appropriate feedback - Great day for surfing!!!
            System.out.println("Great day for surfing!");
        }
        
        else if (wavesHeight >=3 ) {
            System.out.println("Go body boarding!");
        }     
        else if ( wavesHeight >= 0 ){
            System.out.println("Go for a swim!");
        }
        
        else {
            System.out.println("Whoa! What kind of surf is that!");
        }
    }
}
