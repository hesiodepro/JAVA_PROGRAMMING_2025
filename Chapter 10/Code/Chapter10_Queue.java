class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int removedElement = elements[0];
        System.arraycopy(elements, 1, elements, 0, --size);
        return removedElement;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

public class Chapter10_Queue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
