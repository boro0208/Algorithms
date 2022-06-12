package com.company.sortalgorithms;

public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public void sortAsc(){
        for (int i = this.array.length -1; i > 0; i--){
            int largest = 0;
            for(int a = 0; a <= i; a++) {
                if (this.array[a] > this.array[largest]) {
                    largest = a;
                }
            }

            swap(this.array, largest, i);
        }
    }

    public void sortDesc(){
        for (int i = this.array.length -1; i > 0; i--){
            int smallest = 0;
            for(int a = 0; a <= i; a++) {
                if (this.array[a] < this.array[smallest]) {
                    smallest = a;
                }
            }

            swap(this.array, smallest, i);
        }
    }

    public void printArray(){
        for (int j : this.array) {
            System.out.print(j);
        }
        System.out.print("\n");
    }

    private void swap(int[] array, int i, int j){
        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
