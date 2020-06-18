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

    DIntArray(int[] mass, int num, int pos) {
        this.oldArray = mass;
        add(num);
        atInsert(pos, num);
        atDelete(pos);
        at(pos);
    }

    public void add(int num) {
        newArray = new int[oldArray.length + 1];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        newArray[newArray.length - 1] = num;
    }

    public void atInsert(int pos, int num) {
        newArray = new int[oldArray.length + 1];
        System.arraycopy(oldArray, 0, newArray, 0, pos);
        newArray[pos] = num;
        System.arraycopy(oldArray, pos, newArray, pos + 1, oldArray.length - pos);

    }

    public void atDelete(int pos) {
        newArray = new int[oldArray.length - 1];
        System.arraycopy(oldArray, 0, newArray, 0, pos);
        System.arraycopy(oldArray, pos, newArray, pos - 1, oldArray.length - pos);
    }

    public int at(int pos) {
        this.num = oldArray[pos];
        return this.num;
    }


    public static void main(String[] args) {

        int[] mass = {5, 8, 15, 28, 99, 33, 0, -2};
        DIntArray opera = new DIntArray(mass);
        DIntArray second = new DIntArray(mass, 123, 4);
//        opera.add(777);
//        opera.atInsert(5, 66);
//        opera.atDelete(3);
//        System.out.println(Arrays.toString(opera.newArray));
//        System.out.println(Arrays.toString(second.newArray));
        opera.atDelete(4);
        System.out.println(Arrays.toString(opera.newArray));
        opera.at(5);
        System.out.println(opera.at(5));


    }
}
