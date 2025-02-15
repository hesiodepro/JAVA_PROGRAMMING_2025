public class Chapter1_Average_Speed {
    public static void main(String[] args) {
        
        double kilometers = 14;  
        int minutes = 45;        
        int seconds = 30;        

        double miles = kilometers / 1.6;

        double hours = minutes / 60.0 + seconds / 3600.0;

        double average = miles / hours;

        // Display the result
        System.out.println("The average speed in miles is : " + average );
    }
}
