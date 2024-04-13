package com.company;
public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private final Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Реализация методов интерфейса MyList
}

public class MyArrayList<E> implements MyList<E> {
    // Ваш существующий код класса

    @Override
    public void add(E element) {
        // Логика добавления элемента в список ArrayList
    }

    @Override
    public void add(int index, E element) {
        // Логика добавления элемента по индексу в список ArrayList
    }

    @Override
    public E get(int index) {
        // Логика получения элемента по индексу из списка ArrayList
        return null; // замените на соответствующую логику
    }

    @Override
    public E remove(int index) {
        // Логика удаления элемента по индексу из списка ArrayList
        return null; // замените на соответствующую логику
    }

    @Override
    public int size() {
        // Логика получения размера списка ArrayList
        return 0; // замените на соответствующую логику
    }

    @Override
    public boolean isEmpty() {
        // Логика проверки списка ArrayList на пустоту
        return false; // замените на соответствующую логику
    }
}