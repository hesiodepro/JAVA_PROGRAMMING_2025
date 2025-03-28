public class Chapter13_TestGeometricObjects {
    public static void main(String[] args) {
        Chapter13_GeometricObjects7[] objects = new Chapter13_GeometricObjects7[4];
        objects[0] = new Chapter13_Circle4(5);      
        objects[1] = new Chapter13_Circle4(3);     
        objects[2] = new Chapter13_Rectangle4(4, 6);
        objects[3] = new Chapter13_Rectangle4(7, 2); 

        double totalArea = Chapter13_GeometricObjectUtils.sumArea(objects);

        System.out.println("Total area of all geometric objects: " + totalArea);
    }
}
