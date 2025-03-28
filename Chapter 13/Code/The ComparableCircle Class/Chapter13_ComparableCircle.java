public class Chapter13_ComparableCircle extends Chapter13_Circle2 implements Comparable<Chapter13_ComparableCircle> {

    public Chapter13_ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Chapter13_ComparableCircle other) {
        double thisArea = this.getArea();
        double otherArea = other.getArea();

        if (thisArea > otherArea) {
            return 1;
        } else if (thisArea < otherArea) {
            return -1;
        } else {
            return 0;
        }
    }
}
