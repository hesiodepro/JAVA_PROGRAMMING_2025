
import java.util.Scanner;
import java.util.Calendar;

public class Chapter2_CurrentTime {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the timezone offset to GMT: ");
        int timeZone = input.nextInt();
        
        Calendar calendar = Calendar.getInstance();
        
        calendar.add(Calendar.HOUR, timeZone);
        
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        
        System.out.printf("The current time is %02d:%02d:%02d\n ", hour, minutes, seconds);
        
    }
}
