package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] oldArray;
    private int[] newArray;
    private int num;
    private int pos;

    DIntArray() {
    }

    DIntArray(int[] mass) {
        this.oldArray = mass;

    }

    public void add(int num) {
        newArray = new int[oldArray.length + 1];
        System.arraycopy(oldArray,0,newArray,0,oldArray.length);
        newArray[newArray.length-1] = num;
    }


    public static void main(String[] args) {

        int[] mass = {5, 8, 15, 28, 99, 33, 0, -2};
        DIntArray opera = new DIntArray(mass);
        opera.add(777);
        System.out.println(Arrays.toString(mass));

    }
}
