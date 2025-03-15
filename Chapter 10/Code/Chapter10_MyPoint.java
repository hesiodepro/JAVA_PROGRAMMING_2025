class Chapter10_MyPoint {
    private double x;
    private double y;

    public Chapter10_MyPoint() {
        this(0, 0);
    }

    public Chapter10_MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Chapter10_MyPoint p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public static double distance(Chapter10_MyPoint p1, Chapter10_MyPoint p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public static void main(String[] args) {
        Chapter10_MyPoint p1 = new Chapter10_MyPoint(0, 0);
        Chapter10_MyPoint p2 = new Chapter10_MyPoint(10, 30.5);

        System.out.println("Distance: " + Chapter10_MyPoint.distance(p1, p2));
    }
}
