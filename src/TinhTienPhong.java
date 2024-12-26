class TienPhong implements Comparable<TienPhong>{
    private String maKhachHang;
    private String tenKhachHang;
    private String sophong;
    private String ngayNhanPhong;
    private String ngayTraPhong;
    private int tienDichVuPhatSinh;
    private static int cnt = 0;
    private long soNgayO;
    private int tongTien;



    String chuanHoaNgay(String ngay){
        StringBuilder sb = new StringBuilder(ngay);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        return sb.toString();
    }

    public TienPhong(String tenKhachHang, String sophong, String ngayNhanPhong, String ngayTraPhong, int tienDichVuPhatSinh) {
        cnt ++;
        if(cnt < 10) this.maKhachHang = "KH0" + cnt;
        else this.maKhachHang = "KH" + cnt;
        String[] word = tenKhachHang.split("\\s+");
        String res = "";
        for(String x : word){
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase();
        }
        this.tenKhachHang = res;
        this.sophong = sophong;
        this.ngayNhanPhong = chuanHoaNgay(ngayNhanPhong);
        this.ngayTraPhong = chuanHoaNgay(ngayTraPhong);
        this.tienDichVuPhatSinh = tienDichVuPhatSinh;
        String[] word1 = this.ngayNhanPhong.split("/");
        String[] word2 = this.ngayTraPhong.split("/");
        long x = Long.parseLong(word1[2]) * 365 + Long.parseLong(word1[1]) * 30 + Long.parseLong(word1[0]);
        long y = Long.parseLong(word2[2]) * 365 + Long.parseLong(word2[1]) * 30 + Long.parseLong(word2[0]);
        this.soNgayO = y - x;
        this.tongTien = this.tienDichVuPhatSinh;
        if(this.sophong.charAt(0) == '1'){
            this.tongTien += 25;
        }else if(this.sophong.charAt(0) == '2'){
            this.tongTien += 34;
        }else if(this.sophong.charAt(0) == '3'){
            this.tongTien += 50;
        }else{
            this.tongTien += 80;
        }
    }


    @Override
    public int compareTo(TienPhong o) {
        return this.tongTien - o.tongTien;
    }

    public String toString(){
        return this.maKhachHang + " " + this.tenKhachHang + " " + this.sophong + " " + this.soNgayO + "" + this.tongTien;
    }
}


public class TinhTienPhong {
    public static void main(String[] args) {

    }
}
