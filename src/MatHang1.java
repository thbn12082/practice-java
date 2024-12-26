import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Mathang{
    private String maMatHang;
    private String tenMatHang;
    private String nhomHang;
    private float giaMua;
    private float giaBan;
    private float loiNhuan;
    private static int cnt = 0;

    public Mathang(String tenMatHang, String nhomHang, float giaMua ,float giaBan) {
        cnt ++;
        this.maMatHang = "" + cnt;
        this.tenMatHang = tenMatHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - this.giaMua;
    }

    public float getLoiNhuan() {
        return loiNhuan;
    }

    public String toString(){
        return this.maMatHang + " " + this.tenMatHang + " " + this.nhomHang + " " + String.format("%.2f",this.loiNhuan);
    }

}
public class MatHang1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mathang> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;  i < n; i++){
            arr.add(new Mathang(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(arr, new Comparator<Mathang>() {
            @Override
            public int compare(Mathang o1, Mathang o2) {
                return -(int)(o1.getLoiNhuan() - o2.getLoiNhuan());
            }
        });

        for(Mathang x : arr){
            System.out.println(x);
        }
    }
}
