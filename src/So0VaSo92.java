import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So0VaSo92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while(Long.parseLong(q.peek()) % n != 0){
                Long x = Long.parseLong(q.poll());
                q.add(x + "0");
                q.add(x + "9");
            }
            System.out.println(q.peek());
        }
    }
}
