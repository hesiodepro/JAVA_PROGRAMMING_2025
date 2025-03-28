public class Chapter13_Course implements Cloneable {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Chapter13_Course(String courseName) {
        this.courseName = courseName;
        students = new String[100]; 
        numberOfStudents = 0;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public Chapter13_Course clone() {
        try {
            Chapter13_Course clonedCourse = (Chapter13_Course) super.clone();

            clonedCourse.students = new String[students.length];
            for (int i = 0; i < numberOfStudents; i++) {
                clonedCourse.students[i] = new String(students[i]);  
            }

            return clonedCourse;

        } catch (CloneNotSupportedException e) {
            return null;  
        }
    }
}
