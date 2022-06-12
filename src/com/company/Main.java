package com.company;

import com.company.sortalgorithms.BubbleSort;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(new int[]{9, 3, 6, 2, 7, 1});
        bubbleSort.sortAsc();
        bubbleSort.printArray();
        bubbleSort.sortDesc();
        bubbleSort.printArray();
    }
}
