package com.Alzakhar.Lesson2;

public class MyArrayList<T> {

    private T[] list;
    private int size;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 10;
    private static final float LOAD_FACTOR = 0.5f;


    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        this.list = (T[]) new Object[capacity];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Capacity should be >= 0");
        }
        this.capacity = initialCapacity;
        this.list = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkCapacity() {
        if ((float) size / capacity >= LOAD_FACTOR) {
            capacity = capacity * 2;
        }
    }

    public boolean add(T t) {
        checkCapacity();
        list[size] = t;
        size++;
        return true;
    }


    public void add(int index, T element) {
        checkIndex(index);
        checkCapacity();
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = element;
        size++;
    }

    public boolean remove(T o) {
        int i = indexOf(o);
        if (i == -1) {
            return false;
        } else {
            remove(i);
            return true;
        }
    }

    public T remove(int index) {
        checkIndex(index);
        T removingData = list[index];
        for (int i = index; i < size; i++) {
            list[index] = list[index + 1];
        }
        size--;
        list[size] = null;
        return removingData;
    }

    private void checkIndex(int index) {
        if (index < 0 && index >= size) {
            throw new IllegalArgumentException("index" + index + "is incorrect");
        }
    }

    public T get(int index) {
        checkIndex(index);
        return list[index];
    }

    public void set(int index, T element) {
        checkIndex(index);
        list[index] = element;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
