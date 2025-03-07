import java.util.Scanner;

public class Chapter7_AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[] scores = new int[numStudents];
        int bestScore = 0;

        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        for (int i = 0; i < numStudents; i++) {
            char grade;
            if (scores[i] >= bestScore - 10) {
                grade = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grade = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grade = 'C';
            } else if (scores[i] >= bestScore - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
}
