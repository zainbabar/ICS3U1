public class MaxInTheMiddle {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 3, 2};
        int[] c = {1, 4, 2};
        MaxInTheMiddle obj = new MaxInTheMiddle();
        System.out.println(obj.maxInTheMiddle(a, b, c));
    }   

    public int maxInTheMiddle(int[] a, int[] b, int[] c){
        int max = 0;
        if (a[1] > max){
            max = a[1];
        }
        if (b[1] > max){
            max = b[1];
        }
        if (c[1] > max){
            max = c[1];
        }

        return max;
    }
}