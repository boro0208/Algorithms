package com.company.sortalgorithms;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void sortAsc(){
        for (int i = this.array.length -1; i > 0; i--){
            for(int a = 0; a < i; a++){
                if (this.array[a] >this.array[a+1])
                    swap(this.array, a, a+1);
            }
        }
    }

    public void sortDesc(){
        for (int i = this.array.length -1; i > 0; i--){
            for(int a = 0; a < i; a++){
                if (this.array[a] < this.array[a+1])
                    swap(this.array, a, a+1);
            }
        }
    }

    public void printArray(){
        for (int j : this.array) {
            System.out.println(j);
        }
    }

    private void swap(int[] array, int i, int j){
        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
