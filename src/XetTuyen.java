import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class NhanVien2{
    private String ma;
    private String hoVaTen;
    private String ngaySinh;
    private double diemLyThuyet;
    private double diemThuccHanh;
    private static int cnt = 0;
    private int tuoi;
    private int diemTrungBinh;
    private double diemThuong;
    private String xepLoai;


    public NhanVien2(String hoVaTen, String ngaySinh, double diemLyThuyet, double diemThuccHanh) {
        cnt ++;
        if(cnt < 10) this.ma = "PH0" + cnt;
        else this.ma = "PH" + cnt;
        this.hoVaTen = "";
        String[] word1 = hoVaTen.split("\\s+");
        for(String x : word1){
            this.hoVaTen += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() +" ";
        }
        this.ngaySinh = ngaySinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThuccHanh = diemThuccHanh;

        String[] word = this.ngaySinh.split("/");
        this.tuoi = 2024 - Integer.parseInt(word[2]);
        if(diemLyThuyet >= 8 && diemThuccHanh >= 8){
            this.diemThuong = 1;
        }else if(diemLyThuyet >= 7.5 && diemLyThuyet < 8 && diemThuccHanh < 8 && diemThuccHanh >= 7.5){
            this.diemThuong = 0.5;
        }else{
            this.diemThuong = 0;
        }

        this.diemTrungBinh = (int)(Math.round((this.diemLyThuyet + this.diemThuccHanh) / 2 + this.diemThuong));
        if(this.diemTrungBinh > 10) this.diemTrungBinh = 10;
        if(this.diemTrungBinh >= 9){
            this.xepLoai = "Xuat Sac";
        }else if(this.diemTrungBinh >= 8){
            this.xepLoai = "Gioi";
        }else if(this.diemTrungBinh >= 7){
            this.xepLoai = "Kha";
        }else if(this.diemTrungBinh >= 5){
            this.xepLoai = "Trung binh";
        }else{
            this.xepLoai = "Truot";
        }
    }


    public String toString(){
        return this.ma + " " + this.hoVaTen  + this.tuoi + " " + this.diemTrungBinh + " " + this.xepLoai;
    }

}
public class XetTuyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien2> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new NhanVien2(sc.nextLine().trim(), sc.nextLine().trim(), Double.parseDouble(sc.nextLine().trim()), Double.parseDouble(sc.nextLine().trim())));
        }
        for(NhanVien2 x : arr) System.out.println(x);
    }
}
