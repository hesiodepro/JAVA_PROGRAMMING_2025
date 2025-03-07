public class Chapter8_NearestPoints {
    public static void main(String[] args) {
        double[][] points = {
            {-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
            {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
            {-1.5, 4, 2}, {5.5, 4, -0.5}
        };
        
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1], points[p2]);
        
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = distance(points[i], points[j]);
                if (dist < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = dist;
                }
            }
        }
        
        System.out.println("The closest two points are: (" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ") and (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");
    }

    public static double distance(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2) + Math.pow(p2[2] - p1[2], 2));
    }
}
