import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BangDiem implements Comparable<BangDiem> {
    private String hoTen;
    private double diem1;
    private double diem2;
    private double diem3;
    private String maSinhVien;
    private static int cnt = 0;
    private double diemTrungBinh;
    private int xepHang;

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public BangDiem(String hoTen, double diem1, double diem2, double diem3) {
        cnt ++;
        if( cnt < 10) this.maSinhVien = "SV0" + cnt;
        else this.maSinhVien = "SV" + cnt;
        String[] word = hoTen.split("\\s+");
        this.hoTen = "";
        for(String x : word){
            this.hoTen += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        }

        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemTrungBinh = (this.diem1* 3  + this.diem2 * 3 + this.diem3 * 2)/8;

    }

    @Override
    public int compareTo(BangDiem o) {
        return -(int)(this.diemTrungBinh - o.diemTrungBinh);
    }

    public String toString(){
        return this.maSinhVien + " " + this.hoTen + String.format("%.2f",this.diemTrungBinh) + " " + this.xepHang;
    }
}
public class TinhDiemTrungBinh {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new BangDiem(sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim()),Double.parseDouble(sc.nextLine().trim())));
        }
        Collections.sort(arr);
        arr.get(0).setXepHang(1);
        System.out.println(arr.get(0));
        for(int i = 1; i < n; i++){
            if(arr.get(i).getDiemTrungBinh() == arr.get(i-1).getDiemTrungBinh()){
                arr.get(i).setXepHang(arr.get(i-1).getXepHang());
                System.out.println(arr.get(i));
            }else{
                arr.get(i).setXepHang(i + 1);
                System.out.println(arr.get(i));
            }
        }
    }
}
