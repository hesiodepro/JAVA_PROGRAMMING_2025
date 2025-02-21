import java.util.Scanner;

public class Chapter3_FutureDates {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();
        
        int futureDay = (today + elapsedDays) % 7;
        
        String todayName = "";
        String futureDaysName = "";
        
        if(today == 0){todayName = "Sunday";}
        else if (today == 1){todayName = "Monday";}
        else if (today == 2){todayName = "Tuesday";}
        else if (today == 3){todayName = "Wednesday";}
        else if (today == 4){todayName = "Thursday";}
        else if (today == 5){todayName = "Friday";}
        else if (today == 6){todayName = "Saturday";}
        
        if(futureDay == 0){futureDaysName = "Sunday";}
        else if (futureDay == 1){futureDaysName = "Monday";}
        else if (futureDay == 2){futureDaysName = "Tuesday";}
        else if (futureDay == 3){futureDaysName = "Wednesday";}
        else if (futureDay == 4){futureDaysName = "Thursday";}
        else if (futureDay == 5){futureDaysName = "Friday";}
        else if (futureDay == 6){futureDaysName = "Saturday";}
        
        System.out.println("Today is: " + todayName + " and the future day is: " + futureDaysName );
        
    }
}
