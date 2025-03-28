import java.util.*;

public class Calendars_13 {
    public static void main(String[] args) {
        int month = (args.length > 0) ? Integer.parseInt(args[0]) - 1 : Calendar.getInstance().get(Calendar.MONTH);
        int year = (args.length > 1) ? Integer.parseInt(args[1]) : Calendar.getInstance().get(Calendar.YEAR);

        Calendar calendar = new GregorianCalendar(year, month, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.printf("    %1$tB %1$tY%n", calendar);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int currentDay = 1;
        for (int i = 1; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int i = startDay; i <= 7; i++) {
            System.out.printf("%2d ", currentDay++);
        }
        System.out.println();

        while (currentDay <= daysInMonth) {
            for (int i = 1; i <= 7 && currentDay <= daysInMonth; i++) {
                System.out.printf("%2d ", currentDay++);
            }
            System.out.println();
        }
    }
}
