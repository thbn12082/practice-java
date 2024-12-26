import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class nhap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instant now = Instant.now();
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println(zonedDateTime);
    }
}
