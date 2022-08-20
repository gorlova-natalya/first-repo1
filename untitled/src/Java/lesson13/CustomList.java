package Java.lesson13;

import java.util.Arrays;

public class CustomList<T> {

    private T[] array;
    private static final int DEFAULT_SIZE = 10;
    private static final int MULTIPLIER = 2;
    private int lastEmptyIndex = 0;

    public CustomList() {
        this.array = (T[]) new Object[DEFAULT_SIZE];
    }

    public CustomList(int size) {
        this.array = (T[]) new Object[size];
    }

    public void add(T element) {
        if (lastEmptyIndex >= array.length) {
            T[] newArray = (T[]) new Object[array.length * MULTIPLIER];
            System.arraycopy(array, 0, newArray, 0, array.length);
            this.array = newArray;
        }
        this.array[lastEmptyIndex] = element;
        lastEmptyIndex++;
    }

    public boolean remove(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                lastEmptyIndex--;
                return true;
            }
        }
        return false;
    }

    public boolean contains(T element) {
        for (T t : array) {
            if (element == t) {
                return true;
            }
        }
        return false;
    }

    public void clean() {
        this.array = (T[]) new Object[array.length];
        lastEmptyIndex = 0;
    }

    public T get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "array=" + Arrays.toString(Arrays.copyOfRange(array, 0, lastEmptyIndex)) +
                '}';
    }
}
