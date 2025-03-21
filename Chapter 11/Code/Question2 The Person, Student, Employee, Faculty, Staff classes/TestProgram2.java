public class TestProgram2 {
    public static void main(String[] args) {
        MyDate hireDate = new MyDate(01, 01, 2025);

        Person person = new Person("Hesiode Nishya", "KN 2st", "0785878650", "hesionishya@gmail.com");
        Student student = new Student("Murorunkwere", "KN 22st", "0798736492", "murorunkwere@gmail.com", Student.SENIOR);
        Employee employee = new Employee("Habarugira", "KG 2st", "0799467382", "habarugira@gmail.com", "Room 101", 1000000, hireDate);
        Faculty faculty = new Faculty("Dr. Mukire", "KK 509st", "0788836645", "mukire@gmail.com", "Room 202", 1500000, hireDate, "8 AM - 12 PM", "Professor");
        Staff staff = new Staff("Muhirwa", "KK 12st", "0788653782", "muhirwa@gmail.com", "Room 303", 800000, hireDate, "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
