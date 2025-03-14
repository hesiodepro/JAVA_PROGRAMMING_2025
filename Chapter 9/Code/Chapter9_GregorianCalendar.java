import java.util.GregorianCalendar;

public class Chapter9_GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Current Date:");
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("\nDate after setting elapsed time:");
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
