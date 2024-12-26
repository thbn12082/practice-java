import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SanPham implements Comparable<SanPham>{
    private String maSanPham;
    private String tenSanPham;
    private int giaBan;
    private int thoiHanBaoHanh;

    public SanPham(String maSanPham, String tenSanPham, int giaBan, int thoiHanBaoHanh) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }


    @Override
    public int compareTo(SanPham o) {
        return - (this.giaBan - o.giaBan);
    }
    public String toString(){
        return this.maSanPham + " " + this.tenSanPham + " " + this.giaBan + " " + this.thoiHanBaoHanh;
    }
}


public class DanhSachSanPham {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            arr.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for(SanPham x : arr){
            System.out.println(x);
        }
    }
}
