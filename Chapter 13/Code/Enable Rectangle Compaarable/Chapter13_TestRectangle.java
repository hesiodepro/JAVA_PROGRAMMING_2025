public class Chapter13_TestRectangle {
    public static void main(String[] args) {
        Chapter13_Rectangle3 rect1 = new Chapter13_Rectangle3(4, 5);  
        Chapter13_Rectangle3 rect2 = new Chapter13_Rectangle3(5, 4);  

        Chapter13_Rectangle3 rect3 = new Chapter13_Rectangle3(6, 3);  

        System.out.println("rect1 equals rect2: " + rect1.equals(rect2)); 
        System.out.println("rect1 equals rect3: " + rect1.equals(rect3)); 

        System.out.println("Comparing rect1 and rect2: " + rect1.compareTo(rect2)); 
        System.out.println("Comparing rect1 and rect3: " + rect1.compareTo(rect3)); 

        System.out.println("rect1: " + rect1);
        System.out.println("rect2: " + rect2);
        System.out.println("rect3: " + rect3);
    }
}
