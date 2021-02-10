package dataStructures;

import java.util.ArrayList;

/*
binary tree represented as an array

arr[(i-1) / 2] is parent node
arr[(i*2) + 1] is left child
arr[(i*2) + 2] is left child
 */
public class Heap {

    private ArrayList<Integer> heap;

    public Heap() {
        heap = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getHeap() {
        return heap;
    }

    // set up for a max heap
    public void heapify(int index) {
        int size = heap.size();
        int largest = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if (left < size && heap.get(left) > heap.get(largest)) {
            largest = left;
        }
        if (right < size && heap.get(right) > heap.get(largest)) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void insert(int element) {
        int size = heap.size();

        if (size == 0) {
            heap.add(element);
        } else {
            heap.add(element);
            for (int i = (size - 1) / 2; i >= 0; i--) {
                heapify(i);
            }
        }
    }

    public void remove(int element) {
        int size = heap.size();
        int i;

        for (i = 0; i < size; i++) {
            if (element == heap.get(i)) {
                break;
            }
        }
        swap(i, size - 1);
        heap.remove((size - 1));

        for (int j = (size - 1) / 2; j >= 0; j--) {
            heapify(j);
        }
    }
}
