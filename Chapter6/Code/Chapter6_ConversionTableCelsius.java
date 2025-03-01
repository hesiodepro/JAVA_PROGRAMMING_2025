
public class Chapter6_ConversionTableCelsius {
    public static void main(String[] args) {
        System.out.println("Celsius   Fahrenheit | Fahrenheit   Celsius");
        for (double celsius = 40.0; celsius >= 30.0; celsius--) {
            double fahrenheit = celsiusToFahrenheit(celsius);
            double fahrenheit2 = 120.0 - (celsius - 30.0) * 10;
            double celsius2 = fahrenheitToCelsius(fahrenheit2);
            System.out.printf("%-10.1f%-13.1f| %-12.1f%-10.2f\n", celsius, fahrenheit, fahrenheit2, celsius2);
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
