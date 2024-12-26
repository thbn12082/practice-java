public class Nguoi {
    private String hoTen;
    private Integer namSinh;
    private Boolean gioiTinh;

    public Nguoi(String hoTen, Integer namSinh, Boolean gioiTinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }



    public Integer getNamSinh() {
        return this.namSinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
