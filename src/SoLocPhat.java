import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            ArrayList<String> res = new ArrayList<>();
            while(!q.isEmpty()){
                String m = q.poll();
                res.add(m);
                if(m.length() < n){
                    q.add(m + "6");
                    q.add(m + "8");
                }
            }
            System.out.println(res.size());
            for(int i = res.size() - 1 ; i >= 0; i--){
                System.out.print(res.get(i) + " ");
            }
            System.out.println();
        }
    }
}
