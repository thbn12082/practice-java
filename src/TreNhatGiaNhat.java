import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Nguoi1 implements Comparable<Nguoi1> {
    private String name;
    private String dateOfBirth;
    private String tachTuoi;

    public Nguoi1(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        String[] word = this.dateOfBirth.trim().split("/");
        this.tachTuoi = "" + word[2] + word[1] + word[0];
    }

    public String toString(){
        return this.name;
    }


    @Override
    public int compareTo(Nguoi1 o) {
        return -this.tachTuoi.compareTo(o.tachTuoi);
    }
}
public class TreNhatGiaNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Nguoi1> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new Nguoi1(sc.next(), sc.nextLine()));
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size() - 1));
    }
}
