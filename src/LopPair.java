import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Pair<T1, T2>{
    private Integer a;
    private Integer b;

    public Pair(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    private boolean checkNt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public boolean isPrime(){
        if(checkNt(this.a) && checkNt(this.b)){
            return true;
        }
        else{
            return false;
        }
    }


    public String toString(){
        return this.a + " " + this.b;
    }
}


public class LopPair {
    public static void main(String[] args) throws FileNotFoundException {
          Scanner sc = new Scanner(new File("DATA.in"));
//        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n- i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
