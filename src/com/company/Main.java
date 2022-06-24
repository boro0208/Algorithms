package com.company;

import com.company.sortalgorithms.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {9, 3, 6, 2, 7, 1,9};
        int[] arrayRadix = {9345, 3516, 6256, 2124, 7235, 1114,9532};

//        System.out.println(Arrays.toString(array));
//        System.out.println("Bubble Sort Algorithm");
//        BubbleSort bubbleSort = new BubbleSort(array);
//        bubbleSort.sortAsc();
//        bubbleSort.printArray();

//        System.out.println("Selection Sort Algorithm");
//        SelectionSort selectionSort = new SelectionSort(array);
//        selectionSort.sortAsc();
//        selectionSort.printArray();

//        System.out.println("Insertion Sort Algorithm");
//        InsertionSort insertionSort = new InsertionSort(array);
//        insertionSort.sortAsc();
//        insertionSort.printArray();

//        System.out.println("Shell Sort Algorithm");
//        ShellSort shellSort = new ShellSort(array);
//        shellSort.sortAsc();
//        shellSort.printArray();

        System.out.println("Merge Sort Algorithm");
        MergeSort mergeSort = new MergeSort();
        mergeSort.sortAsc(array, 0 , array.length);
        mergeSort.printArray();
        mergeSort.sortDesc(array, 0 , array.length);
        mergeSort.printArray();

//        System.out.println("Quick Sort Algorithm");
//        QuickSort quickSort = new QuickSort();
//        quickSort.sortAsc(array, 0 , array.length);
//        quickSort.printArray();

//        System.out.println("Counting Sort Algorithm");
//        CountingSort countingSort = new CountingSort();
//        countingSort.sortAsc(array, 1 , 9);
//        countingSort.printArray();


//        System.out.println("Radix Sort Algorithm");
//        RadixSort radixSort = new RadixSort();
//        radixSort.sortAsc(arrayRadix, 10 , 4);
//        radixSort.printArray();
    }
}
