import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class GiangVien implements Comparable<GiangVien> {
    private String maGiangVien;
    private String tenGiangVien;
    private String tenBoMon;
    private static int cnt = 0;
    private String tenRutGon;
    public GiangVien(String tenGiangVien, String tenBoMon) {
        cnt ++;
        if(cnt < 10) this.maGiangVien = "GV0" + cnt;
        else this.maGiangVien = "GV" + cnt;
        this.tenGiangVien = tenGiangVien;
        this.tenBoMon = tenBoMon;
        this.tenRutGon = "";
        String[] word = this.tenBoMon.split("\\s+");
        for(String x : word){
            this.tenRutGon += Character.toUpperCase(x.charAt(0));
        }
    }

    public String getTenRutGon() {
        return tenRutGon;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public String toString(){
        return this.maGiangVien + " " + this.tenGiangVien + " " + this.tenRutGon;
    }

    @Override
    public int compareTo(GiangVien o) {
        if(!this.tenGiangVien.equals(o.tenGiangVien)){
            return -this.tenGiangVien.compareTo(o.tenGiangVien);
        }
        else{
            return -this.maGiangVien.compareTo(o.maGiangVien);
        }

    }
}
public class SapXepGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            arr.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
//        Collections.sort(arr);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            s = s.toLowerCase();
            for(GiangVien x : arr){
                if(x.getTenGiangVien().toLowerCase().contains(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
