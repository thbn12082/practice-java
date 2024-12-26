import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String maDoanhNghiep;
    private String tenDoanhNghiep;
    private int soSinhVienCoTheNhan;

    public DoanhNghiep(String maDoanhNghiep, String tenDoanhNghiep, int soSinhVienCoTheNhan) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.soSinhVienCoTheNhan = soSinhVienCoTheNhan;
    }

    public String getMaDoanhNghiep() {
        return maDoanhNghiep;
    }

    public void setMaDoanhNghiep(String maDoanhNghiep) {
        this.maDoanhNghiep = maDoanhNghiep;
    }

    public String getTenDoanhNghiep() {
        return tenDoanhNghiep;
    }

    public void setTenDoanhNghiep(String tenDoanhNghiep) {
        this.tenDoanhNghiep = tenDoanhNghiep;
    }

    public int getSoSinhVienCoTheNhan() {
        return soSinhVienCoTheNhan;
    }

    public void setSoSinhVienCoTheNhan(int soSinhVienCoTheNhan) {
        this.soSinhVienCoTheNhan = soSinhVienCoTheNhan;
    }

    public String toString(){
        return this.maDoanhNghiep + " " + this.tenDoanhNghiep + " " + this.soSinhVienCoTheNhan;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.soSinhVienCoTheNhan != o.soSinhVienCoTheNhan){
            return -(this.soSinhVienCoTheNhan - o.soSinhVienCoTheNhan);
        }
        else{
            return this.maDoanhNghiep.compareTo(o.maDoanhNghiep);
        }
    }
}


public class SinhVienThucTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(arr);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        for(DoanhNghiep x : arr){
            if(x.getSoSinhVienCoTheNhan() >= a && x.getSoSinhVienCoTheNhan() <= b){
                System.out.println(x);
            }

        }
    }
}
