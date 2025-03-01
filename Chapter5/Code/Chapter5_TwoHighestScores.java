import java.util.Scanner;

public class Chapter5_TwoHighestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        String topStudent = "", secondStudent = "";
        int highestScore = Integer.MIN_VALUE, secondHighestScore = Integer.MIN_VALUE;
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = input.next();
            System.out.print("Enter student score: ");
            int score = input.nextInt();
            
            if (score > highestScore) {
                secondHighestScore = highestScore;
                secondStudent = topStudent;
                highestScore = score;
                topStudent = name;
            } else if (score > secondHighestScore) {
                secondHighestScore = score;
                secondStudent = name;
            }
        }
        
        System.out.println("Student with the highest score: " + topStudent);
        System.out.println("Student with the second highest score: " + secondStudent);
    }
}
