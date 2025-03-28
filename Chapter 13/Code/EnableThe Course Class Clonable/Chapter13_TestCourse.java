public class Chapter13_TestCourse {
    public static void main(String[] args) {
        Chapter13_Course course1 = new Chapter13_Course("Java Programming");
        course1.addStudent("Alice");
        course1.addStudent("Bob");

        Chapter13_Course course2 = course1.clone();

        course2.addStudent("Charlie");

        System.out.println("Students in course1:");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(course1.getStudents()[i]);
        }

        System.out.println("\nStudents in course2 (cloned):");
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.println(course2.getStudents()[i]);
        }
    }
}
