import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DoanhNghiep1 implements Comparable<DoanhNghiep1>{
    private String maDoanhNghiep;
    private String tenDoanhNghiep;
    private int soSinhVienCoTheNhan;

    public DoanhNghiep1(String maDoanhNghiep, String tenDoanhNghiep, int soSinhVienCoTheNhan) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.soSinhVienCoTheNhan = soSinhVienCoTheNhan;
    }

    public String toString(){
        return this.maDoanhNghiep + " " + this.tenDoanhNghiep + " " + this.soSinhVienCoTheNhan;
    }


    @Override
    public int compareTo(DoanhNghiep1 o) {
        return this.maDoanhNghiep.compareTo(o.maDoanhNghiep);
    }
}
public class DanhSachDoanhNghiep {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep1> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new DoanhNghiep1(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for(DoanhNghiep1 x : arr){
            System.out.println(x);
        }
    }
}
