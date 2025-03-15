
public class Chapter10_Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Chapter10_Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[10]; // Initial capacity of 10
        this.numberOfStudents = 0;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            increaseArraySize();
        }
        students[numberOfStudents++] = student;
    }

    private void increaseArraySize() {
        String[] newStudents = new String[students.length * 2]; // Double the size
        System.arraycopy(students, 0, newStudents, 0, students.length);
        students = newStudents;
    }

    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }

        if (index != -1) { // Shift elements left
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        } else {
            System.out.println("Student not found in course.");
        }
    }

    public void clear() {
        students = new String[10]; // Reset to initial size
        numberOfStudents = 0;
    }

    public String[] getStudents() {
        String[] result = new String[numberOfStudents];
        System.arraycopy(students, 0, result, 0, numberOfStudents);
        return result;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}



