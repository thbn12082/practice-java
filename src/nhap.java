import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class nhap {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());


        FileInputStream input = null;
        FileOutputStream output = null;
        try{

            output = new FileOutputStream("output.txt");
            input = new FileInputStream("output.txt");

            ArrayList<HocSinh> arr = new ArrayList<>();
            for(Integer i = 0; i < n; i++){
                HocSinh x = new HocSinh(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextBoolean());
                arr.add(x);
                System.out.println(x);
            }

            ObjectOutputStream oos = new ObjectOutputStream(output);
            oos.writeObject(arr);
            System.out.println("ghi file thanh cong");


            ObjectInputStream ois = new ObjectInputStream(input);
            ArrayList<HocSinh> binh = new ArrayList<>();
            binh = (ArrayList) ois.readObject();
            for(HocSinh x : binh){
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
