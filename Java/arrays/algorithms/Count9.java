package Java.arrays.algorithms;

public class Count9 {
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 7, 9, 12, 97, 24, 9};
        int count = 0;
        for (int i = 0; i < data.length; i++){
            if (data[i] == 9){
                count++;
            }
        }
        System.out.println(count);
    }
}
