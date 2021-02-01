package dataStructures;

public class LinkedList {
    private class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size;

    public LinkedList() {
        head = null;
    }

    public void add(int data) {

    }

    public int get(int index) {
        return 0;
    }

}