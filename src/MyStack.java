import java.util.NoSuchElementException;

public class MyStack {
    private Object[] array;
    private int top;

    public MyStack() {
        array = new Object[10];
        top = -1;
    }

    public void push(Object value) {
        if (top == array.length - 1) {
            resizeArray();
        }
        top++;
        array[top] = value;
    }

    public void remove(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < top; i++) {
            array[i] = array[i + 1];
        }
        array[top] = null;
        top--;
    }

    public void clear() {
        array = new Object[10];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public Object peek() {
        if (top == -1) {
            throw new NoSuchElementException();
        }
        return array[top];
    }

    public Object pop() {
        if (top == -1) {
            throw new NoSuchElementException();
        }
        Object value = array[top];
        array[top] = null;
        top--;
        return value;
    }

    private void resizeArray() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
