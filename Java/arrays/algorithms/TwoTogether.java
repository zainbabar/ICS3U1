package Java.arrays.algorithms;

public class TwoTogether {
    public static void main(String[] args) {

        int[]a =  {1, 2, 3, 4, 5};
        int[]b =  {6, 7, 8, 9, 10};

        TwoTogether obj = new TwoTogether();

        int[] c = obj.twoTogether(a, b);

        for (int i = 0; i < c.length; i++){
            System.out.print(c[i]);
            System.out.print(" ");
        }

        System.out.println();
    }

    public int[] twoTogether(int[] a, int[] b){

        int[] c = new int[a.length + b.length];

        int i = 0;

        for (; i < a.length; i++){
            c[i] = a[i];
        }

        for (int j = 0; j < b.length; j++, i++){
            c[i] = b[j];
        }

        return c;
    }
}