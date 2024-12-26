import java.io.Serializable;

public class HocSinh extends Nguoi implements IHoatDong, Serializable  {

    private String tenLop;


    public HocSinh(String hoTen, Integer namSinh, Boolean gioiTinh) {
        super(hoTen, namSinh, gioiTinh);
    }


    @Override
    public String toString() {
        return "HocSinh{" +
                super.toString() + '\'' +
                "tenLop='" + tenLop + '\'' +
                '}';
    }

    @Override
    public String gioithieu() {
        return this.tenLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public Integer getNamSinh(){
        return super.getNamSinh();
    }

}
