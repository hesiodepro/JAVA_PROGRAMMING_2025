import java.util.Scanner;

public class Chapter4_EstimateAreas {
    public static void main(String[] args) {
        
        double[][] cities = {
            {33.7490, -84.3880}, // Atlanta, Georgia
            {28.5383, -81.3792}, // Orlando, Florida
            {32.0809, -81.0912}, // Savannah, Georgia
            {35.2271, -80.8431}  // Charlotte, North Carolina
        };
        
        for (int i = 0; i < cities.length; i++) {
            cities[i][0] = Math.toRadians(cities[i][0]);
            cities[i][1] = Math.toRadians(cities[i][1]);
        }
        
        final double RADIUS = 6371.01;
        
        double d1 = computeDistance(cities[0], cities[1], RADIUS);
        double d2 = computeDistance(cities[1], cities[2], RADIUS);
        double d3 = computeDistance(cities[2], cities[0], RADIUS);
        double d4 = computeDistance(cities[2], cities[3], RADIUS);
        double d5 = computeDistance(cities[3], cities[0], RADIUS);
        
        double area1 = computeTriangleArea(d1, d2, d3);
        double area2 = computeTriangleArea(d3, d4, d5);
        
        double totalArea = area1 + area2;
        
        System.out.printf("The estimated area enclosed by the four cities is %.2f km^2\n", totalArea);
    }
    
    public static double computeDistance(double[] city1, double[] city2, double radius) {
        return radius * Math.acos(Math.sin(city1[0]) * Math.sin(city2[0]) + 
                                  Math.cos(city1[0]) * Math.cos(city2[0]) * Math.cos(city1[1] - city2[1]));
    }
    
    public static double computeTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
