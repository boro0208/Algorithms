package com.company.sortalgorithms;

public class QuickSort {
    private int[] array;

    public QuickSort() {
    }

    public void sortAsc(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(array, start, end);

        sortAsc(array, start, pivotIndex);
        sortAsc(array, pivotIndex + 1, end);

        this.array = array;
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && array[--j] >= pivot) ;
            if (i < j) {
                array[i] = array[j];
            }

            while (i < j && array[++i] <= pivot) ;
            if (i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;

        return j;
    }

    public void printArray() {
        for (int j : this.array) {
            System.out.print(j);
        }
        System.out.print("\n");
    }
}
