package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] oldArray;
    private int[] newArray;
    private int num;
    private int pos;

    DIntArray() {
    }

    DIntArray(int[] mass, int num, int pos) {
        this.oldArray = mass;
        add(num);
    }

    public void add(int num) {
        this.newArray = new int[oldArray.length + 1];
        newArray[newArray.length-1] = num;

    }


    public static void main(String[] args) {

        int[] mass = {5, 8, 15, 28, 99, 33, 0, -2};
        DIntArray opera = new DIntArray(mass, 777, 10);
        System.out.println(Arrays.toString(mass));

    }
}
