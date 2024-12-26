import java.util.Scanner;
import java.util.Stack;
class Pair2{
    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Pair2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean isGreater(int val){
        return a > val;
    }
}
public class NhipChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            Stack<Pair2> st = new Stack<>();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int[] res = new int[n];
            for(int i = 0; i < n; i++){
                while(!st.empty() && !st.peek().isGreater(a[i])){
                    st.pop();
                }
                if(st.empty()){
                    res[i] = i + 1;
                }
                else{
                    res[i] = i - st.peek().getB();
                }
                st.push(new Pair2(a[i], i));
            }

        for(int x : res){
            System.out.print(x + " ");
        }
            System.out.println();
        }
    }
}
