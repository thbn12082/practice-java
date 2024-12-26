import java.io.Serializable;

public class NhanVien implements Serializable {
    private String maNhanVien;
    private String hoTen;
    private int tuoi;
    private int luong;

    public NhanVien(String maNhanVien, String hoTen, int tuoi, int luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                '}';
    }
}
