import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            input = new FileInputStream("input.txt");
            output = new FileOutputStream("output.txt");
            int c;
            while((c = input.read()) != -1){
                System.out.println(c);
                output.write(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(input != null){
                input.close();
            }
            if(output != null){
                output.close();
            }

        }
    }
}
