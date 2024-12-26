import java.util.ArrayList;
import java.util.Scanner;

class SinhVien3{
    private String maSinhVien;
    private String hoVaTen;
    private String lop;
    private String email;
    public SinhVien3(String maSinhVien, String hoVaTen, String lop, String email) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public String toString(){
        return this.maSinhVien + " " + this.hoVaTen + " " + this.lop +" "+ this.email;
    }
}
public class SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien3> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new SinhVien3(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        String x = sc.nextLine();
        System.out.println("DANH SACH SINH VIEN LOP " + x + ":");
        for(SinhVien3 s : arr){
            if(s.getLop().equalsIgnoreCase(x)){
                System.out.println(s);
            }
        }
    }
}
