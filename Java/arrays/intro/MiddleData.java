public class MiddleData {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        MiddleData obj = new MiddleData();
        int[] c = obj.middleData(a, b);
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public int[] middleData(int[] a, int[] b){
        int[] c = {a[a.length / 2], b[b.length / 2]};
        return c;
    }
}
