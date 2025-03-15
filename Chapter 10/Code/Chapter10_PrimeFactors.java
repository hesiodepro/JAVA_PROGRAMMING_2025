import java.util.Scanner;

class StackOfIntegers {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class Chapter10_PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        int factor = 2;
        while (number > 1) {
            while (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            }
            factor++;
        }

        System.out.print("Prime factors in decreasing order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
