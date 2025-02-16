public class Chapter1_AverageSpeedInKilometer {
    public static void main (String[] args){
        
        double miles = 24;
        int hour = 1;
        int minutes = 40;
        int seconds = 35;
        
        double kilometers = miles * 1.6;
 
        double hours = hour + (minutes / 60.0) + (seconds / 3600.0);
        
        double average = kilometers / hours;
        
        //Display the average speed
        System.out.println("The average speed is " + average + " k/h");
    }
}
