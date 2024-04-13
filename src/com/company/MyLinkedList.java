package com.company;
public class MyLinkedList<E> implements MyList<E> {
    private class MyNode {
        E element;
        MyNode next;
        MyNode prev;

        MyNode(E element) {
            this.element = element;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Implementing MyList interface methods

    @Override
    public void add(E element) {
        add(size, element);
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        MyNode newNode = new MyNode(element);
        if (size == 0) {
            head = tail = newNode;
        } else if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (index == size) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            MyNode prevNode = getNode(index - 1);
            MyNode nextNode = prevNode.next;
            newNode.next = nextNode;
            newNode.prev = prevNode;
            prevNode.next = newNode;
            nextNode.prev = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        return getNode(index).element;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        MyNode removedNode;
        if (size == 1) {
            removedNode = head;
            head = tail = null;
        } else if (index == 0) {
            removedNode = head;
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            removedNode = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            MyNode prevNode = getNode(index - 1);
            removedNode = prevNode.next;
            prevNode.next = removedNode.next;
            removedNode.next.prev = prevNode;
        }
        size--;
        return removedNode.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Helper method to get the node at the specified index
    private MyNode getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}


public class MyLinkedList<E> implements MyList<E> {
    // Ваш существующий код класса

    @Override
    public void add(E element) {
        // Логика добавления элемента в список LinkedList
    }

    @Override
    public void add(int index, E element) {
        // Логика добавления элемента по индексу в список LinkedList
    }

    @Override
    public E get(int index) {
        // Логика получения элемента по индексу из списка LinkedList
        return null; // замените на соответствующую логику
    }

    @Override
    public E remove(int index) {
        // Логика удаления элемента по индексу из списка LinkedList
        return null; // замените на соответствующую логику
    }

    @Override
    public int size() {
        // Логика получения размера списка LinkedList
        return 0; // замените на соответствующую логику
    }

    @Override
    public boolean isEmpty() {
        // Логика проверки списка LinkedList на пустоту
        return false; // замените на соответствующую логику
    }
}