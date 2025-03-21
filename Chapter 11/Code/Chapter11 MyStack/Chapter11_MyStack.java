import java.util.ArrayList;

public class Chapter11_MyStack extends ArrayList<String> {
    public void push(String element) {
        add(element);
    }

    public String pop() {
        if (!isEmpty()) {
            return remove(size() - 1);
        }
        return null;
    }

    public String peek() {
        if (!isEmpty()) {
            return get(size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
