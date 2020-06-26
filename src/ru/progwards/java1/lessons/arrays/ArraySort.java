package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {


    public static void sort(int[] a) {

        int SWAP;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    SWAP = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = SWAP;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] b = {-92, 22, 11, -73, 48, -85, -3, 96, -7, -17};
        sort(b);
        System.out.println(Arrays.toString(b));


    }
}
