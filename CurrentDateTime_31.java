import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime_31 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        System.out.println("Current date and time: " + sdf.format(now));
    }
}
