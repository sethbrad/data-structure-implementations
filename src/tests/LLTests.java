package tests;

import dataStructures.LinkedList;

public class LLTests {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(5);
        list.add(3);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
