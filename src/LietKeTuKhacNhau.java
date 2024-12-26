import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VanBan.in"));
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNextLine()){
            String x = sc.nextLine();
            String[] word = x.split("\\s+");
            for(String s : word){
                set.add(s.toLowerCase());
            }
        }
        for(String x : set){
            System.out.println(x);
        }
    }
}
