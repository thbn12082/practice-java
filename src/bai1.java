import java.util.Scanner;
import java.util.TreeSet;

class IntSet {
    private TreeSet<Integer> arr = new TreeSet<>();
    public IntSet(int[] a){
        for(int x : a){
            this.arr.add(x);
        }
    }

    public IntSet(TreeSet<Integer> arr) {
        this.arr = arr;
    }

    public TreeSet<Integer> getArr() {
        return arr;
    }

    public IntSet union(IntSet b){
        TreeSet<Integer> se = new TreeSet<>();
        se.addAll(arr);
        se.addAll(b.getArr());
        return  new IntSet(se);

    }

    @Override
    public String toString() {
        return "IntSet{" +
                "arr=" + arr +
                '}';
    }
}
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int[] a = new int[n];
       int[] b = new int[m];
       for(int i = 0; i < n; i++){
           a[i] = sc.nextInt();
       }
       for(int i = 0; i < m; i++){
           b[i] = sc.nextInt();
       }

       IntSet s1 = new IntSet(a);
       IntSet s2 = new IntSet(b);
       IntSet s3 = s1.union(s2);
       System.out.println(s3);
    }
}
