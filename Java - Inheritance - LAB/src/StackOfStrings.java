import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {

    private List<String> data;
    private int index;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String element) {
        this.data.add(element);
        index++;
    }

    public String peek() {
        return data.get(this.index);
    }

    public String pop() {
        return data.remove(this.index--);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
