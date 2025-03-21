public class Chapter12_OutOfMemoryError {

    public static void main(String[] args) {
        try {
            // Attempt to allocate a very large array to cause an OutOfMemoryError
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Caught an OutOfMemoryError: " + e.getMessage());
        }
    }
}
