import java.io.*;
import java.util.Scanner;
public class ObjectOutputExample {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            input = new FileInputStream("output.txt");
            output = new FileOutputStream("output.txt");
            Stock[] s = {new Stock (1, "CD ROM", 100, 2),
                         new Stock (2, "CPU", 500, 2),
                         new Stock (3, "HP Scannner", 75, 1)};
            ObjectOutputStream oss = new ObjectOutputStream(output);
            oss.writeObject(s);

            ObjectInputStream ois = new ObjectInputStream(input);
            Stock[] arr = (Stock[])ois.readObject();
            for(Stock x : arr){
                System.out.println(x);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if(input != null){
                input.close();
            }
            if(output != null){
                output.close();
            }
        }
    }
}
