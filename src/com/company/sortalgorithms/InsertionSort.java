package com.company.sortalgorithms;

public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public void sortAsc(){
        for (int i = 1; i < this.array.length; i++){
            int newElement  = this.array[i];
            int a;
            for(a = i; a > 0 && this.array[a - 1] > newElement; a--) {
                this.array[a] = this.array[a - 1];
            }
            this.array[a] = newElement;
        }
    }

    public void sortDesc(){
        for (int i = 1; i < this.array.length; i++){
            int newElement  = this.array[i];
            int a;
            for(a = i; a > 0 && this.array[a - 1] < newElement; a--) {
                this.array[a] = this.array[a - 1];
            }
            this.array[a] = newElement;
        }
    }

    public void printArray(){
        for (int j : this.array) {
            System.out.print(j);
        }
        System.out.print("\n");
    }

}
