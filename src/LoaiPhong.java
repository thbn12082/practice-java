import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Phong implements Comparable<Phong>{
    private String kyHieuPhong;
    private String tenLoaiPhong;
    private int donGiaNgay;
    private float phiPhucVu;

    public Phong(String kyHieuPhong, String tenLoaiPhong, int donGiaNgay, float phiPhucVu) {
        this.kyHieuPhong = kyHieuPhong;
        this.tenLoaiPhong = tenLoaiPhong;
        this.donGiaNgay = donGiaNgay;
        this.phiPhucVu = phiPhucVu;
    }

    @Override
    public int compareTo(Phong o) {
        return this.tenLoaiPhong.compareTo(o.tenLoaiPhong);
    }

    public String toString(){
        return this.kyHieuPhong + " " + this.tenLoaiPhong + " " + this.donGiaNgay + " " + this.phiPhucVu;
    }
}
public class LoaiPhong {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Phong> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new Phong(sc.next(), sc.next(), Integer.parseInt(sc.next()), Float.parseFloat(sc.next())));
        }
        Collections.sort(arr);
        for(Phong x : arr){
            System.out.println(x);
        }
    }
}
