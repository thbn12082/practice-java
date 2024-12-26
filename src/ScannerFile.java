import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(input);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
