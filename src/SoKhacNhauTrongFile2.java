import com.sun.source.tree.Tree;

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException {
        DataInputStream input  = new DataInputStream (new FileInputStream("DATA.in"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(input.available() > 0){
            try{
                int x = input.readInt();
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }
                else{
                    map.put(x, 1);
                }
            }catch(Exception e){
                continue;
            }
        }
        map.forEach((k,v) ->{
            System.out.println(k + " " + v);
        });
    }
}
