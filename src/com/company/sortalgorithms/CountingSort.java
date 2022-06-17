package com.company.sortalgorithms;

public class CountingSort {
    private int[] array;

    public CountingSort() {
    }

    public void sortAsc(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

        this.array = input;
    }


    public void printArray() {
        for (int j : this.array) {
            System.out.print(j);
        }
        System.out.print("\n");
    }
}
