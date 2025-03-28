abstract class Geometric_Object {
    private String color;
    private boolean filled;

    public Geometric_Object() {
        this.color = "white";
        this.filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double area();
    public abstract double perimeter();
}
