import java.util.Date;

public class Chapter9_Date {
    public static void main(String[] args) {
        long[] timeStamps = {10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};
        
        for (long time : timeStamps) {
            Date date = new Date(time);
            System.out.println("Elapsed Time: " + time + " -> " + date.toString());
        }
    }
}
