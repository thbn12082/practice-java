import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class SoThuanNghichTrongFile {
    public static boolean thuanNghich(int n){
        String x = String.valueOf(n);
        StringBuilder sb = new StringBuilder(x);
        if(x.length() % 2 == 0 && x.length() == 1) return false;
        for(int i = 0; i < x.length(); i++){
            if((x.charAt(i) - '0') % 2 == 0) return false;
        }
        if(x.equals(sb.reverse().toString())) return true;
        return false;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) o2.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        TreeSet<Integer>  set = new TreeSet<>();
        for(int x : a1){
            if(thuanNghich(x)){
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }else{
                    map.put(x, 1);
                }
            }
        }
        for(int x : a2){
            if(thuanNghich(x) && map.containsKey(x)){
                set.add(x);
                map.put(x, map.get(x) + 1);
            }
        }
        int dem = 0;
        for(int x : set){
            dem ++;
            System.out.println(x + " " + map.get(x));
            if(dem == 10){
                break;
            }
        }
        o1.close();
        o2.close();
    }
}
