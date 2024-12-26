import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MatHangb implements  Comparable<MatHangb>{
    private String maHang;
    private String tenHang;
    private String nhomHang;
    private float giaMua;
    private float giaBan;
    private static int cnt = 0;
    private float loiNhuan;

    public MatHangb(String tenHang, String nhomHang, float giaMua, float giaBan) {
        cnt ++;
        if(cnt < 10) this.maHang = "MH0" + cnt;
        else this.maHang = "MH" + cnt;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - this.giaMua;
    }

    @Override
    public int compareTo(MatHangb o) {
        return -(int) (this.loiNhuan - o.loiNhuan);
    }
    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.nhomHang + " " + String.format("%.2f", this.loiNhuan);
    }
}
public class SapXepMatHang {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<MatHangb> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            arr.add(new MatHangb(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(arr);
        for(MatHangb x : arr){
            System.out.println(x);
        }
    }
}
