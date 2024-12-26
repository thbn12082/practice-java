import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Diem{
    private String maSinhVien;
    private String hoVaTen;
    private String lop;
    private String email;

    public String getLop() {
        return lop;
    }

    public Diem(String maSinhVien, String hoVaTen, String lop, String email) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Diem{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", lop='" + lop + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


public class BangDiemSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Diem> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new Diem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<Diem>() {
            @Override
            public int compare(Diem o1, Diem o2) {
                return o1.getLop().compareTo(o2.getLop());
            }
        });
        for(Diem x : arr){
            System.out.println(x);
        }
    }
}
