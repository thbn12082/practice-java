import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileReader input = null;
        FileWriter output = null;
        try{
            input = new FileReader("input.txt");
            output = new FileWriter("output.txt");
            int c;
            while((c = input.read()) != -1){
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
