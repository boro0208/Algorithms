package com.company.sortalgorithms;

public class ShellSort {
    private int[] array;

    public ShellSort(int[] array) {
        this.array = array;
    }

    public void sortAsc(){
        for (int gap = this.array.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < this.array.length; i++){
                int newElement = this.array[i];
                int j = i;
                while (j >= gap && this.array[j - gap] > newElement){
                    this.array[j] = this.array[j - gap];
                    j -= gap;
                }
                this.array[j] = newElement;
            }
        }
    }

    public void sortDesc(){
        for (int gap = this.array.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < this.array.length; i++){
                int newElement = this.array[i];
                int j = i;
                while (j >= gap && this.array[j - gap] < newElement){
                    this.array[j] = this.array[j - gap];
                    j -= gap;
                }
                this.array[j] = newElement;
            }
        }
    }

    public void printArray(){
        for (int j : this.array) {
            System.out.print(j);
        }
        System.out.print("\n");
    }
}
