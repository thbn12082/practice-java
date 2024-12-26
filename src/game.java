import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class TinhGio{
    private String maNguoiChoi;
    private String tenNguoiChoi;
    private String gioVao;
    private String gioRa;
    private String gioChoi;
    public String getGioChoi() {
        return gioChoi;
    }
    public TinhGio(String maNguoiChoi, String tenNguoiChoi, String gioVao, String gioRa) {
        this.maNguoiChoi = maNguoiChoi;
        this.tenNguoiChoi = tenNguoiChoi;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        String[] word1 = this.gioVao.split(":");
        String[] word2 = this.gioRa.split(":");
        int phut;
        if(!word2[1].equals("00")){
            phut = Integer.parseInt(word2[1]) - Integer.parseInt(word1[1]);
        }else{
            phut =  Integer.parseInt(word1[1]) - 60;
        }
        int gio;
        if(phut < 0){
            gio = Integer.parseInt(word2[0]) - Integer.parseInt(word1[0]) - 1;
        }
        else{
            gio = Integer.parseInt(word2[0]) - Integer.parseInt(word1[0]);
        }
        this.gioChoi = gio + " gio " + Math.abs(phut) + " phut" ;
    }
    public String toString(){
        return this.maNguoiChoi + " " + this.tenNguoiChoi + " " + this.gioChoi;
    }
}
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TinhGio> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            arr.add(new TinhGio(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<TinhGio>() {
            @Override
            public int compare(TinhGio o1, TinhGio o2) {
                return -o1.getGioChoi().compareTo(o2.getGioChoi());
            }
        });
        for(TinhGio x : arr){
            System.out.println(x);
        }
    }
}
