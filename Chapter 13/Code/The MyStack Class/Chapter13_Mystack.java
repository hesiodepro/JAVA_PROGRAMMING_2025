import java.util.ArrayList;
import java.util.List;

public class Chapter13_Mystack<T> {
    private List<T> list;

    public Chapter13_Mystack() {
        this.list = new ArrayList<>();
    }

    public Chapter13_Mystack(List<T> inputList) {
        
        this.list = new ArrayList<>(inputList);
    }

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public List<T> getList() {
        return new ArrayList<>(list); 
    }

    public Chapter13_Mystack<T> deepCopy() {
        return new Chapter13_Mystack<>(this.list);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
