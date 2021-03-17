package tests;

import dataStructures.Heap;

public class HeapTests {
    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(1);
        h.insert(2);
        h.insert(3);
        h.insert(4);
        h.insert(5);

        System.out.println(h.getHeap().toString());

        h.remove(5);
        System.out.println(h.getHeap().toString());

    }
}
