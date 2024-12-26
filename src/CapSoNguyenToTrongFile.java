import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class CapSoNguyenToTrongFile {
    public static boolean checkNt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> arr1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) o2.readObject();
        for(int x : arr2){
            set.add(x);
        }
        for(int x : arr1){
            int tmp = 1000000 - x;
            if(tmp > x && checkNt(tmp) && set.contains(tmp)){
                System.out.println(x + " " + tmp);
            }
        }
        o1.close();
        o2.close();
    }
}
