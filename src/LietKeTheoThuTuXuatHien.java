import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("VANBAN.in"));
        ArrayList<String> a1 = (ArrayList<String>) o1.readObject();

        Scanner sc = new Scanner(new File("NHIPHAN.in"));
        TreeSet<String> set = new TreeSet<>();
        for(String x : a1){
            set.add(x.trim());
        }
        while(sc.hasNextLine()){
            String x = sc.nextLine().trim();
            String[] word = x.split("\\s+");
            for(String t : word){
                set.add(t);
            }
        }
        System.out.println(set.size());
        o1.close();
        sc.close();
    }
}
