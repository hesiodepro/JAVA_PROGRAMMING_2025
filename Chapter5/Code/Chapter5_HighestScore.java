import java.util.Scanner;

public class Chapter5_HighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        String topStudent = "";
        int highestScore = Integer.MIN_VALUE;
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = input.next();
            System.out.print("Enter student score: ");
            int score = input.nextInt();
            
            if (score > highestScore) {
                highestScore = score;
                topStudent = name;
            }
        }
        
        System.out.println("Student with the highest score: " + topStudent);
    }
}
