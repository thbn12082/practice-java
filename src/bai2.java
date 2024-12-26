import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    TreeSet<String> se = new TreeSet<>();
    public WordSet(String sc) {
        String[] word = sc.split("\\s+");
        for(String x : word){
            se.add(x);
        }
    }

    public TreeSet<String> getSe() {
        return se;
    }

    public String union(WordSet b){
        TreeSet<String> x = new TreeSet<>();
        x.addAll(b.getSe());
        TreeSet<String> tmp = new TreeSet<>();
        tmp.addAll(this.se);
        for(String s : x){
            tmp.add(s);
        }
        return tmp.toString();
    }



    public String intersection(WordSet b){
        String tmp = "";
        for(String x : this.se){
            if(b.getSe().contains(x)){
                tmp += x + " ";
            }
        }
        return tmp;
    }



}


public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1 = new WordSet(sc.nextLine());
        WordSet s2 = new WordSet(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
