import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien1{
    private String maThiSinh;
    private String hoTen;
    private String ngaySinh;
    private float diem1;
    private float diem2;
    private float diem3;
    private float tongDiem;
    private static int cnt = 0;

    public SinhVien1(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
        cnt ++;
        this.maThiSinh = "" + cnt;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongDiem = this.diem1 + this.diem2 + this.diem3;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public String toString(){
        return this.maThiSinh + " " + this.hoTen + " " + this.ngaySinh + " " + this.tongDiem;
    }

}
public class ThuKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien1> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            arr.add(new SinhVien1(sc.nextLine(), sc.nextLine(),Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(arr, new Comparator<SinhVien1>() {
            @Override
            public int compare(SinhVien1 o1, SinhVien1 o2) {
                return (int)(o1.getTongDiem() - o2.getTongDiem());
            }
        });
        float x = arr.get(arr.size() - 1).getTongDiem();
        for(SinhVien1 s : arr){
            if(s.getTongDiem() == x){
                System.out.println(s);
            }
        }

    }
}
