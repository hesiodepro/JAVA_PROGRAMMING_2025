import java.util.Arrays;

public class Chapter8_ComputeWeeklyHours {
    public static void main(String[] args) {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };
        
        int[][] employeeHours = new int[hours.length][2];
        for (int i = 0; i < hours.length; i++) {
            int totalHours = 0;
            for (int j = 0; j < hours[i].length; j++) {
                totalHours += hours[i][j];
            }
            employeeHours[i][0] = i;
            employeeHours[i][1] = totalHours;
        }
        
        Arrays.sort(employeeHours, (a, b) -> Integer.compare(b[1], a[1]));
        
        for (int i = 0; i < employeeHours.length; i++) {
            System.out.println("Employee " + employeeHours[i][0] + " total hours: " + employeeHours[i][1]);
        }
    }
}
