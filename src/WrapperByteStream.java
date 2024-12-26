import java.io.*;
import java.util.Scanner;

public class WrapperByteStream {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedInputStream bufferIn = null;
        BufferedOutputStream bufferOut = null;
        try{
            FileInputStream input = new FileInputStream("input.txt");
            FileOutputStream output = new FileOutputStream("output.txt");
            bufferIn = new BufferedInputStream(input);
            bufferOut = new BufferedOutputStream(output);

            int c;
            while((c = bufferIn.read()) != -1){
                bufferOut.write(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(bufferIn != null){
                bufferIn.close();
            }
            if(bufferOut != null){
                bufferOut.close();
            }
        }
    }
}
