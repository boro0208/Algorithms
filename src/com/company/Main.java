package com.company;

import com.company.sortalgorithms.*;

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

//        InsertionSort insertionSort = new InsertionSort(new int[]{9, 3, 6, 2, 7, 1,9});
//        insertionSort.sortAsc();
//        insertionSort.printArray();
//        insertionSort.sortDesc();
//        insertionSort.printArray();

//        ShellSort shellSort = new ShellSort(new int[]{9, 3, 6, 2, 7, 1,9});
//        shellSort.sortAsc();
//        shellSort.printArray();
//        shellSort.sortDesc();
//        shellSort.printArray();

        int[] array = {9, 3, 6, 2, 7, 1,9};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sortAsc(array, 0 , array.length);
        mergeSort.printArray();
    }
}
