package org.example;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayObjectIterator<T> implements Iterator<T> {
    private final T[] array;
    private int currentIndex = 0;

    public ArrayObjectIterator(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the array");
        }
        return array[currentIndex++];
    }
}
