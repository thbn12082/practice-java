import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class SinhVienTrongFile{
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;
    private String maSinhVien;
    private static int cnt = 0;

    public SinhVienTrongFile(String hoTen, String lop, String ngaySinh, float gpa) {
        cnt ++;
        if(cnt < 10) this.maSinhVien = "B20DCCN00" + cnt;
        else this.maSinhVien = "B20DCCN0" + cnt;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3,"0");
        this.ngaySinh = sb.toString();
    }
    public String toString(){
        return this.maSinhVien + " "+ this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.1f", this.gpa);
    }
}
public class DanhSachSVTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVienTrongFile> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new SinhVienTrongFile(sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())));
        }
        for(SinhVienTrongFile x : arr){
            System.out.println(x);
        }
    }
}
