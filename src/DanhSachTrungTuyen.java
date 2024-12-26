import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ThiSinh implements Comparable<ThiSinh> {
    private String maThiSinh;
    private String hoVaTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float tongDiem;
    private float diemUuTien;

    private String check(float x){
        int b = (int)x;
        if(b == x) return String.valueOf(b);
        return String.valueOf(x);
    }


    public ThiSinh(String maThiSinh, String hoVaTen, float diemToan, float diemLy, float diemHoa) {
        this.maThiSinh = maThiSinh;
        this.hoVaTen = "";
        String[] word = hoVaTen.split("\\s+");
        for(String x : word){
            this.hoVaTen += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() +" ";
        }
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        if(this.maThiSinh.substring(0, 3).equals("KV1")){
            this.diemUuTien = 0.5F;
            this.tongDiem = (float) (this.diemToan*2 + this.diemHoa + this.diemLy + 0.5);
        }else if(this.maThiSinh.substring(0, 3).equals("KV2")){
            this.diemUuTien = 1F;
            this.tongDiem = (float) (this.diemToan*2 + this.diemHoa + this.diemLy + 1);
        }else if(this.maThiSinh.substring(0, 3).equals("KV3")){
            this.diemUuTien = 2.5F;
            this.tongDiem = (float) (this.diemToan*2 + this.diemHoa + this.diemLy + 2.5);
        }
    }

    public float getTongDiem() {
        return tongDiem;
    }

    @Override
    public int compareTo(ThiSinh o) {
        return -(int)(this.tongDiem - o.tongDiem);
    }

    public String toString(){
        return this.maThiSinh + " " + this.hoVaTen + "" + check(this.diemUuTien) +" " +  check(this.tongDiem);
    }
}
public class DanhSachTrungTuyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new ThiSinh(sc.nextLine().trim(), sc.nextLine().trim(), Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(arr);
        int t = Integer.parseInt(sc.nextLine());
//        while(t-- > 0){
//            System.out.println(arr.get(t));
//        }
        float diemTrungTuyen;
        diemTrungTuyen = arr.get(t - 1).getTongDiem();
        System.out.println(diemTrungTuyen);
        for(ThiSinh x : arr){
            if(x.getTongDiem() >= diemTrungTuyen){
                System.out.print(x + " ");
                System.out.println("TRUNG TUYEN");
            }
            else{
                System.out.print(x + " ");
                System.out.println("TRUOT");
            }
        }
    }
}
