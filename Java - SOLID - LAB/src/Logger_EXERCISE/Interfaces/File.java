package Logger_EXERCISE.Interfaces;

public interface File {

    int getSize();
    boolean write(String text);
    void append(String text);
}
