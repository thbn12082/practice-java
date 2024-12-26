import java.io.*;
import java.util.Scanner;

public class WrapperCharacterStream {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferWriter = null;
        BufferedReader bufferReader = null;
        try{
            FileWriter input = new FileWriter("input.txt");
            FileReader output = new FileReader("output.txt");

            bufferWriter = new BufferedWriter(input);
            bufferReader = new BufferedReader(output);

            int c;
            while((c = bufferReader.read()) != -1){
                bufferWriter.write(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(bufferWriter != null){
                bufferWriter.close();
            }
            if(bufferReader != null ){
                bufferReader.close();
            }
        }
    }
}
