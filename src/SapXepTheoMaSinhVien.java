import java.util.ArrayList;
import java.util.Scanner;
class SinhVien2 implements Comparable<SinhVien2>{
    private String maSinhVien;
    private String hoVaTen;
    private String lop;
    private String email;

    public SinhVien2(String maSinhVien, String hoVaTen, String lop, String email) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.lop = lop;
        this.email = email;
    }

    public String toString(){
        return this.maSinhVien + " " + this.hoVaTen + " " + this.lop + " " + this.email;
    }


    @Override
    public int compareTo(SinhVien2 o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }
}
public class SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien2> arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(new SinhVien2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(SinhVien2 x : arr){
            System.out.println(x);
        }
    }
}
