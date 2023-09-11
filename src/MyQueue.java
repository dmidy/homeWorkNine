import java.util.NoSuchElementException;

public class MyQueue {
    private Object[] array;
    private int head;
    private int tail;
    private int size;

    public MyQueue() {
        array = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void add(Object value) {
        if (size == array.length) {
            resizeArray();
        }
        array[tail] = value;
        tail = (tail + 1) % array.length;
        size++;
    }

    public void clear() {
        array = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return array[head];
    }

    public Object poll() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Object value = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return value;
    }

    private void resizeArray() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(head + i) % array.length];
        }
        array = newArray;
        head = 0;
        tail = size;
    }
}
