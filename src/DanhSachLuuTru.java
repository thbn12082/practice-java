import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Khach implements Comparable<Khach>{
    private String maKhachHang;
    private String hoVaTen;
    private String maPhong;
    private String ngayDen;
    private String ngayDi;
    private static int cnt = 0;
    private int soNgayLuuTru;

    @Override
    public int compareTo(Khach o) {
        return -(this.soNgayLuuTru - o.soNgayLuuTru);
    }

    public Khach(String hoVaTen, String maPhong, String ngayDen, String ngayDi) {
        cnt ++;
        if (cnt < 10) this.maKhachHang = "KH0" + cnt;
        else this.maKhachHang = "KH" + cnt;
        this.hoVaTen = hoVaTen;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        String[] word1 = this.ngayDen.split("/");
        String[] word2 = this.ngayDi.split("/");
        String res1 = word1[2] + word1[1] + word1[0];
        String res2 = word2[2] + word2[1] + word2[0];
        this.soNgayLuuTru = Integer.parseInt(res2) - Integer.parseInt(res1);
    }
    public String toString(){
        return this.maKhachHang + " " + this.hoVaTen + " " + this.maPhong + " " + this.soNgayLuuTru;
    }
}

public class DanhSachLuuTru {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new Khach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(Khach x : arr){
            System.out.println(x);
        }
    }
}
