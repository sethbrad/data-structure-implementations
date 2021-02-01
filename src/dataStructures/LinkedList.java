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

    public Node add(int data) {
        Node cur = head;

        if (head == null) {
            head = new Node(data);
            return head;
        }

        while (cur != null) {
            if(cur.next == null) {
                cur.next = new Node(data);
                return head;
            }
            cur = cur.next;
        }
        return head;
    }

    public int get(int index) {
        Node cur = head;
        int count = 0;

        while (count <= index) {
            if(count == index) {
                return cur.data;
            }
            cur = cur.next;
            count++;
        }
        return -1;
    }

}