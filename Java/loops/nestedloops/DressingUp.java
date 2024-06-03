import java.util.Scanner;

public class DressingUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a height");
        int h = scan.nextInt();
        DressingUp obj = new DressingUp();
        obj.draw(h);
    }
    public void draw(int h){
        for (int i = 0; i < h; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < (h - i)* 2 - 1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < h; i++){
            for (int j = 0; j < h - i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < i * 2; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < h - i - 1; j++){
                System.out.print("*");
            }
            
            
            System.out.println();
        }
    }
}