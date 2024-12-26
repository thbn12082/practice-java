import java.util.Scanner;
import java.util.TreeMap;

public class HinhSao {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 1; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) + 1);
        }
        int cnt = 0, cntStar = 0;
        for(Integer x : map.keySet()){
            if(map.get(x) == 1){
                cnt ++;
            }
            else if(map.get(x) == n - 1){
                cntStar ++;
            }
        }
        if(cntStar == 1 && cnt == n - 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
