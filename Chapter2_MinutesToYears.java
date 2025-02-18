 import java.util.Scanner;
 
public class Chapter2_MinutesToYears {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        final int minutesPerHour = 60;
        final int hoursPerDay = 24;
        final int daysPerYear = 365;
        
        System.out.println("Enter the number of minutes: ");
        long minutes = input.nextInt();
        
        long totalHours = minutes / minutesPerHour;
        long totalDays = totalHours / hoursPerDay;
        long years = totalDays / daysPerYear;
        long daysRemaining = totalDays % daysPerYear;
        
        System.out.println(minutes + " Minutes is approximately " + years + " years and " + daysRemaining + " days ");
    }
}
