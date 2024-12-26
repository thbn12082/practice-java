import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class SoNguyenToLonNhatTrongFile {
    public static boolean checkNt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>)ois.readObject();

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int x : arr){
            if(checkNt(x)){
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }
                else{
                    map.put(x, 1);
                }
            }
        }
        Collections.sort(arr);
        for(int i = arr.size() - 1  ; i >= arr.size() - 10; i--){
            System.out.println(arr.get(i) + " " + map.get(arr.get(i)));
        }
    }
}
