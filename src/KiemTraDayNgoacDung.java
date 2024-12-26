import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        TreeMap<Character, Character> map = new TreeMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        while(t-- > 0){
            Stack<Character> st = new Stack<>();
            String s = sc.next();
            for(char x : s.toCharArray()){
                if(!st.empty() && map.getOrDefault(x, '-').equals(st.peek())){
                    st.pop();
                }else{
                    st.push(x);
                }
            }
            if(st.empty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
