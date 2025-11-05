package HW5_11;

import java.util.*;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list = new ArrayList<>();

    public void add(E item) {
        list.add(item);
    }

    public void print() {
        Collections.sort(list);
        System.out.println("Sorted List of KLTN:");
        for (E item : list) {
            System.out.println(item);
        }
    }
}
