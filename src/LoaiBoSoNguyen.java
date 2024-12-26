import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LoaiBoSoNguyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String x = sc.next();
            try{
                Integer.parseInt(x);
            }catch(Exception e){
                arr.add(x);
            }
        }
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(String x : arr){
            System.out.print(x + " ");
        }
    }
}
