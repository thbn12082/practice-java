import java.util.Scanner;
import java.util.Stack;

class Pair1{
    private char c;
    private int i;

    public Pair1(char c, int i) {
        this.c = c;
        this.i = i;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isValid(char x){
        return c == '(' && x == ')';
    }

}

public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Stack<Pair1> st = new Stack<>();
            st.push(new Pair1(')', -1));
            for(int i = 0; i < s.length(); i++){
                if(!st.empty() && st.peek().isValid(s.charAt(i))){
                    st.pop();
                }
                else{
                    st.push(new Pair1(s.charAt(i), i));
                }
            }
            int nextI = s.length();
            int max = -1;
            while(!st.empty()){
                int curI = st.pop().getI();
                max = Math.max(max, nextI - curI - 1);
                nextI = curI;
            }
            System.out.println(max);
        }
    }
}
