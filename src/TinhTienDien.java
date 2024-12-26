import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Dien implements Comparable<Dien>{
    private String maKhachHang;
    private String hoVaTen;
    private String loaiHoGiaDinh;
    private double chiSoDau;
    private double chiSoCuoi;
    private static int cnt = 0;
    private double tongTienPhaiNop;
    private double thueVAT;
    private double tienTrongDinhMuc;
    private double tienVuotDinhMuc;


    private String check(double x){
        int t = (int) x;
        if(t == x) return String.valueOf(t);
        else return String.format("%.1f", x);
    }
    public Dien(String hoVaTen, String loaiHoGiaDinh, double chiSoDau, double chiSoCuoi) {
        cnt ++;
        if( cnt < 10 ) this.maKhachHang = "KH0" + cnt;
        else this.maKhachHang = "KH" + cnt;

        String[] word = hoVaTen.split("\\s+");
        this.hoVaTen = "";
        for(String x : word){
            this.hoVaTen += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        }
        this.loaiHoGiaDinh = loaiHoGiaDinh;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
        this.tienVuotDinhMuc = 0;
        this.tienTrongDinhMuc = 0;
        this.thueVAT = 0;
        double x = this.chiSoCuoi - this.chiSoDau;
        if(this.loaiHoGiaDinh.equals("A")){
            //100
            if(x > 100){
                this.tienTrongDinhMuc = 100*450;
                this.tienVuotDinhMuc = (x - 100)* 1000;
                this.thueVAT = 0.05*this.tienVuotDinhMuc;
            }
            else{
                this.tienTrongDinhMuc = x* 450;
            }
        }else if(this.loaiHoGiaDinh.equals("B")){
            //500
            if(x > 500){
                this.tienTrongDinhMuc = 500*450;
                this.tienVuotDinhMuc = (x - 500)* 1000;
                this.thueVAT = 0.05*this.tienVuotDinhMuc;
            }else{
                this.tienTrongDinhMuc = x* 450;
            }
        }else{
            //200
            if(x > 200){
                this.tienTrongDinhMuc = 200*450;
                this.tienVuotDinhMuc = (x - 200)* 1000;
                this.thueVAT = 0.05*this.tienVuotDinhMuc;
            }else{
                this.tienTrongDinhMuc = x * 450;
            }
        }

        this.tongTienPhaiNop = this.tienTrongDinhMuc + this.tienVuotDinhMuc + this.thueVAT;

    }

    @Override
    public int compareTo(Dien o) {
        return -(int)(this.tongTienPhaiNop - o.tongTienPhaiNop);
    }

    public String toString(){
        return this.maKhachHang + " " + this.hoVaTen + check(this.tienTrongDinhMuc) + " " + check(this.tienVuotDinhMuc) + " " + check(this.thueVAT) + " " + check(this.tongTienPhaiNop);
    }

}
public class TinhTienDien {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KhachHang.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Dien> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(new Dien(sc.nextLine().trim(), sc.next().trim(), Double.parseDouble(sc.next()), Double.parseDouble(sc.next())));
            sc.nextLine();
        }
        Collections.sort(arr);
        for(Dien x : arr) System.out.println(x);
    }
}
