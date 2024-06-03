package Java.arrays.algorithms;

public class Double1100 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0};
        int[] b = {2, 2, 2, 2};
        Double1100 obj = new Double1100();
        System.out.println(obj.double1100(a));
        System.out.println(obj.double1100(b));
    }
    public boolean double1100(int[] x){
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < x.length; i++){
            if (x[i] == 0){
                count0++;
            }
            else if (x[i] == 1){
                count1++;
            }
            if (count0 > 1 || count1 > 0){
                return true;
            }
        }
        return false;
    }
}
