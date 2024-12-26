import java.util.Scanner;
import java.util.Stack;

public class GoPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> bef = new Stack<>();
        Stack<Character> aft = new Stack<>();
        for(char c : s.toCharArray()){
            switch (c){
                case '>' :
                    if(!aft.empty()){
                        bef.push(aft.pop());
                    }
                    break;
                case '<' :
                    if(!bef.empty()){
                        aft.push(bef.pop());
                    }
                    break;
                case '-' :
                    if(!bef.empty()){
                        bef.pop();
                    }
                    break;
                default:
                    bef.push(c);
            }
        }
        String out = "";
        while(!bef.empty()){
            aft.push(bef.pop());
        }
        while(!aft.empty()){
            System.out.print(aft.pop());
        }
        System.out.println();
    }
}
