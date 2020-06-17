package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {


    public static void sort(int[] a) {

        int SWAP;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    SWAP = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = SWAP;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] b = {5, 6, 100, 99, 22};
        sort(b);
        System.out.println(Arrays.toString(b));


    }
}
