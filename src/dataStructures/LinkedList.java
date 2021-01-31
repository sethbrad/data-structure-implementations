package dataStructures;

import java.util.*;

public class LinkedList<E> {
    private class Node {
        Node next;
        E data;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size;

    public LinkedList() {
        head = null;
    }

    public void add(E obj) {

    }

}