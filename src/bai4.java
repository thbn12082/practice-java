import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class NhanVien1{
    private String maNhanVien;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaCHi;
    private String maSoThue;
    private String ngayKyHopDong;
    private static int cnt = 0;

    public NhanVien1(String hoTen, String gioiTinh, String ngaySinh, String diaCHi, String maSoThue, String ngayKyHopDong) {
        cnt ++;
        if(cnt < 10){
            this.maNhanVien = "0000" + cnt;
        }
        else{
            this.maNhanVien = "000" + cnt;
        }
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaCHi = diaCHi;
        this.maSoThue = maSoThue;
        this.ngayKyHopDong = ngayKyHopDong;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    @Override
    public String toString(){
        return this.maNhanVien + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh + " " + this.diaCHi + " " + this.maSoThue + " " + this.ngayKyHopDong;
    }


}
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien1> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new NhanVien1(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }

        Collections.sort(arr, new Comparator<NhanVien1>() {
            @Override
            public int compare(NhanVien1 o1, NhanVien1 o2) {
                String[] word1 = o1.getNgaySinh().split("/");
                String[] word2 = o2.getNgaySinh().split("/");
                String res1 = word1[2] + word1[1] + word1[0];
                String res2 = word2[2] + word2[1] + word2[0];
                return res1.compareTo(res2);
            }
        });
        for(NhanVien1 x : arr){
            System.out.println(x);
        }
    }
}
