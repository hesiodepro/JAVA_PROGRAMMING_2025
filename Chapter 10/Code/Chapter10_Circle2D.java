public class Chapter10_Circle2D {
   
    private double x;
    private double y;
    private double radius;

    public Chapter10_Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Chapter10_Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return distance <= radius;
    }

    public boolean contains(Chapter10_Circle2D circle) {
        double distance = Math.sqrt((this.x - circle.getX()) * (this.x - circle.getX()) + (this.y - circle.getY()) * (this.y - circle.getY()));
        return distance <= this.radius - circle.getRadius();
    }

    public boolean overlaps(Chapter10_Circle2D circle) {
        double distance = Math.sqrt((this.x - circle.getX()) * (this.x - circle.getX()) + (this.y - circle.getY()) * (this.y - circle.getY()));
        return distance < this.radius + circle.getRadius();
    }

    public static void main(String[] args) {
        // Test program
        Chapter10_Circle2D c1 = new Chapter10_Circle2D(2, 2, 5.5);
        
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        
        System.out.println("c1 contains point (3, 3): " + c1.contains(3, 3));
        System.out.println("c1 contains circle (4, 5, 10.5): " + c1.contains(new Chapter10_Circle2D(4, 5, 10.5)));
        
        System.out.println("c1 overlaps with circle (3, 5, 2.3): " + c1.overlaps(new Chapter10_Circle2D(3, 5, 2.3)));
    }
}
