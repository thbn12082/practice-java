import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String tmp;
        while(sc.hasNextLine()){
            String x = sc.nextLine().trim();
            if(x.compareToIgnoreCase("end") == 0){
                break;
            }
            String[] word = x.split("\\s+");
            String res = "";
            for(String s : word){
                res +=Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase() + " ";
            }
            System.out.println(res.trim());
        }
    }
}
