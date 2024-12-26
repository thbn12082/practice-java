import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class SoNguyenToTrongFileNhiPhan {
    public static boolean checkNt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("SONGUYEN.txt"));
        ArrayList<Integer> arr = (ArrayList<Integer>) obj.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int x : arr){
            if(checkNt(x)) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
        }
        map.forEach((k,v) ->{
            System.out.println(k + " " + v);
        });
    }
}