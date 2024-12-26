import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int sum = 0;
        while(sc.hasNext()){
            String x = sc.next();
            try{
                int s = Integer.parseInt(x);
                sum += s;
                System.out.print(s + " ");
            }catch(Exception e){
                continue;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
