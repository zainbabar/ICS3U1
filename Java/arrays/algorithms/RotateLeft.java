package Java.arrays.algorithms;

import java.util.Scanner;

public class RotateLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        RotateLeft obj = new RotateLeft();

        int n = scan.nextInt();

        int[] rotatedNums = obj.rotateLeft(nums, n);

        System.out.println();

        for (int i = 0; i < rotatedNums.length; i++){
            System.out.print(rotatedNums[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public int[] rotateLeft(int[] nums, int n){
        int l = nums.length;
        int[] copy = new int[l];

        for (int i = 0; i < l - n; i++){
            copy[i] = nums[i + n];
        }
        for (int i = 0; i < l - n; i++){
            
            copy[l - n + i] = nums[i];
        }
        
        return copy;
    }
}
