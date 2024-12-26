import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String maMon;
    private String tenMon;
    private int soTinChi;


    public MonHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String toString(){
        return this.maMon + " " + this.tenMon + " " + this.soTinChi;
    }


    @Override
    public int compareTo(MonHoc o) {
        return this.tenMon.compareTo(o.tenMon);
    }
}
public class DanhSachMonHoc {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MonHoc.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for(MonHoc x : arr){
            System.out.println(x);
        }

    }
}
