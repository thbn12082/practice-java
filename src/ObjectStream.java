import java.io.*;
import java.util.Scanner;

public class ObjectStream {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            input = new FileInputStream("output.txt");
            output = new FileOutputStream("output.txt");

            NhanVien[] arr = {new NhanVien("NV001", "Nguyen The Binh", 21, 200),
                              new NhanVien("NV002", "Le Minh Ngoc", 20, 100),
                              new NhanVien("NV003", "Nguyen The Binh", 20, 200)
            };

            ObjectOutputStream oos = new ObjectOutputStream(output);
            oos.writeObject(arr);

            ObjectInputStream ois = new ObjectInputStream(input);
            NhanVien[] arr1 = (NhanVien[])ois.readObject();
            for(NhanVien x : arr1){
                System.out.println(x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(input != null){
                input.close();
            }
            if(output != null){
                output.close();
            }
        }
    }
}
