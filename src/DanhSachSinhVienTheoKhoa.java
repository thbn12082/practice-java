import java.util.ArrayList;
import java.util.Scanner;
class SinhVien4{
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private String email;

    public SinhVien4(String maSinhVien, String hoTen, String lop, String email) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String toString(){
        return this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + this.email;
    }

}
public class DanhSachSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien4> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            arr.add(new SinhVien4(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String x = sc.nextLine();
            String[] word = x.split("\\s+");
            String res = "DC" + Character.toUpperCase(word[0].charAt(0)) + Character.toUpperCase(word[1].charAt(0));

            System.out.println("DANH SACH SINH VIEN NGANH " + x.toUpperCase() + ":");
            for(SinhVien4 s : arr){
                if(s.getMaSinhVien().substring(3,7).equals(res)){
                    System.out.println(s);
                }
            }
        }
    }
}
