public class Chapter10_BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double bmi;

    public Chapter10_BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBMI();
    }

    public Chapter10_BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = (feet * 0.3048) + (inches * 0.0254); 
        this.bmi = calculateBMI();
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBmi() {
        return bmi;
    }

    public static void main(String[] args) {
        Chapter10_BMI person1 = new Chapter10_BMI("John Doe", 25, 150, 1.75);
        Chapter10_BMI person2 = new Chapter10_BMI("Jane Doe", 30, 160, 5, 6); 

        System.out.println(person1.getName() + "'s BMI: " + person1.getBmi());
        System.out.println(person2.getName() + "'s BMI: " + person2.getBmi());
    }
}
