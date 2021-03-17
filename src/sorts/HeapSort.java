package sorts;

import dataStructures.Heap;

import java.util.ArrayList;

public class HeapSort {
    public static ArrayList<Integer> sort(Heap heap) {

        int size = heap.getHeap().size();
        ArrayList<Integer> sorted = new ArrayList<Integer>();

        while (size > 0) {
            sorted.add(heap.getHeap().get(0));
            heap.getHeap().remove(0);
            heap.heapify(0);
            size--;
        }
        return sorted;
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(1);
        h.insert(2);
        h.insert(3);
        h.insert(4);
        h.insert(5);

        System.out.println(h.getHeap().toString());
        System.out.println(sort(h).toString());

    }
}
