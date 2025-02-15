import java.util.Scanner; // import scanner

public class DisplayTime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Prompt user for inout
        System.out.println("Enter an integer for seconds");
        int seconds = input.nextInt();
        
        int minutes = seconds / 60; //Find minutes in seconds
        int remainingSeconds = seconds % 60; //Seconds remaining
        
        System.out.println(seconds + "seconds is" + minutes + "minutes and " + remainingSeconds + "seconds");
    }
    
}
