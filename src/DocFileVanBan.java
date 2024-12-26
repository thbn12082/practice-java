import java.io.FileInputStream;
import java.io.IOException;

public class DocFileVanBan {
    public static void main(String[] args) throws IOException {
        FileInputStream input = null;
        try{
            input = new FileInputStream("DATA.in");
            int c;
            while((c = input.read()) != -1){
                System.out.print(Character.toChars(c));
            }
        }catch(Exception e ){
            e.printStackTrace();
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
}
