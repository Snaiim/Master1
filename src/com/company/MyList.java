package com.company;
public interface MyList<E> {
    void add(E element);
    void add(int index, E element);
    E get(int index);
    E remove(int index);
    int size();
    boolean isEmpty();
}

