package org.example;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayObjectIteratorTest {

    @Test
    public void testIteration() {
        Integer[] testArray = {1, 2, 3};
        ArrayObjectIterator<Integer> iterator = new ArrayObjectIterator<>(testArray);

        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testEmptyArray() {
        String[] emptyArray = {};
        ArrayObjectIterator<String> iterator = new ArrayObjectIterator<>(emptyArray);

        assertFalse(iterator.hasNext());
    }

    @Test
    public void testNoSuchElementException() {
        Integer[] testArray = {1};
        ArrayObjectIterator<Integer> iterator = new ArrayObjectIterator<>(testArray);

        iterator.next();
        assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    public void testNullArray() {
        assertThrows(IllegalArgumentException.class, () -> new ArrayObjectIterator<>(null));
    }
}
