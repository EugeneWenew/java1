package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    Integer N;
    Integer[] sortArray;

    public ArraySort(Integer N) {
        this.N = N;
        this.sortArray = new Integer[N];
    }


    public static void sort(int[] a) {

        Integer SWAP;
        for (Integer i = 1; i < sortArray.length; i++) {
            for (Integer j = 1; j < sortArray.length; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    SWAP = sortArray[j + 1];
                    sortArray[j + 1] = sortArray[j];
                    sortArray[j] = SWAP;
                } else continue;
            }
        }
    }

    public static void main(String[] args) {
        ArraySort[] stAr = new ArraySort(8);
        stAr = {15, 26, 14, 51, 42, 3, 0, 99};
        System.out.println(sort(stAr));

    }
}
