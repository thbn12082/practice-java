import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class SoKhacNhauTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            try{
                int x = Integer.parseInt(sc.next());
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }
                else{
                    map.put(x, 1);
                }
            }catch(Exception e ){
                continue;
            }
        }
        map.forEach((k,v) -> {
            System.out.println(k +" " +  v);
        });
    }
}
