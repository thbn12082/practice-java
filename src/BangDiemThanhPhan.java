import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class SinhVien5 implements Comparable<SinhVien5>{
    private String maSinhVien;
    private String tenSinhVien;
    private String lop;
    private float diem1, diem2, diem3;
    private static int cnt = 0;
    private int dem;
    private String tachTen;
    public SinhVien5(String maSinhVien, String tenSinhVien, String lop, float diem1, float diem2, float diem3) {
        cnt ++;
        this.dem = cnt;
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        String[] word = this.tenSinhVien.split("\\s+");
        String res = "";
        for(int i = word.length - 1; i >= 0; i--){
            res += word[i];
        }
        this.tachTen = res;
    }
    public String toString(){
        return  this.dem + " "+ this.maSinhVien + " " + this.tenSinhVien + " "+this.lop + " " + String.format("%.1f", this.diem1) + " " + String.format("%.1f", this.diem2) + " " + String.format("%.1f", this.diem3);
    }

    @Override
    public int compareTo(SinhVien5 o) {
        return this.tachTen.compareTo(o.tachTen);
    }
}
public class BangDiemThanhPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien5> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new SinhVien5(sc.nextLine(),sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(arr);
        for(SinhVien5 x : arr){
            System.out.println(x);
        }
    }
}
