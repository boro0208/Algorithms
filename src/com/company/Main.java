package com.company;

import com.company.sortalgorithms.BubbleSort;
import com.company.sortalgorithms.InsertionSort;
import com.company.sortalgorithms.SelectionSort;

public class Main {

    public static void main(String[] args) {
//        BubbleSort bubbleSort = new BubbleSort(new int[]{9, 3, 6, 2, 7, 1,9});
//        bubbleSort.sortAsc();
//        bubbleSort.printArray();
//        bubbleSort.sortDesc();
//        bubbleSort.printArray();


//        SelectionSort selectionSort = new SelectionSort(new int[]{9, 3, 6, 2, 7, 1,9});
//        selectionSort.sortAsc();
//        selectionSort.printArray();
//        selectionSort.sortDesc();
//        selectionSort.printArray();

        InsertionSort insertionSort = new InsertionSort(new int[]{9, 3, 6, 2, 7, 1,9});
        insertionSort.sortAsc();
        insertionSort.printArray();
        insertionSort.sortDesc();
        insertionSort.printArray();
    }
}
