import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<Long> q = new LinkedList<>();
            q.add(9L);
            while(q.peek() % n != 0){
                long m = q.poll();
                q.add(m* 10);
                q.add(m* 10 + 9);

            }
            System.out.println(q.peek());
        }

    }
}
