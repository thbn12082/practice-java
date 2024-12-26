import java.util.*;

class SinhVien{
    private String maSv;
    private String hoTen;
    private String ngaySinh;
    private float gpa;
    private static int cnt = 0;

    public SinhVien() {
        this.maSv = "";
        this.hoTen = "";
        this.ngaySinh = "";
        this.gpa = 0;
    }

    public SinhVien(String hoTen, String ngaySinh, float gpa) {
        cnt ++;
        if(this.cnt < 10){
            this.maSv = "B20DCCN00" + cnt;
        }
        else{
            this.maSv = "B20DCCN0" + cnt;
        }
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(2) != '/') sb = sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3,"0");
        return this.maSv + " " + this.hoTen + " " + sb.toString() + " " + String.format("%.2f", this.gpa);
    }

}
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) (o1.getGpa() - o2.getGpa());
            }
        });
        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
}
