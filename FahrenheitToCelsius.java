import java.util.Scanner; 

public class FahrenheitToCelcius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        //Convert fahrenheit to celcius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in calsius");
    }
    
}
