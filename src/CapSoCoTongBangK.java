import java.util.Scanner;
import java.util.TreeMap;

public class CapSoCoTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int cnt = 0;
            TreeMap<Integer, Integer> map = new TreeMap<>();
            while(n-- > 0){
                int m = sc.nextInt();
                cnt += map.getOrDefault(k - m, 0);
                map.put(m, map.getOrDefault(m, 0) + 1);
            }
            System.out.println(cnt);
        }
    }
}
