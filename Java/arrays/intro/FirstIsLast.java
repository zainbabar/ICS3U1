public class FirstIsLast {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 1};
        int[] c = {};
        FirstIsLast obj = new FirstIsLast();
        System.out.println(obj.firstIsLast(a));
        System.out.println(obj.firstIsLast(b));
        System.out.println(obj.firstIsLast(c));
    }
    
    public boolean firstIsLast(int[] x){
        if (x.length >= 1 && x[0] == x[x.length - 1]){
            return true;
        }
        else {
            return false;
        }
    }
}
