package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] oldArray;
    private int[] newArray;
    private int num;
    private int pos;

    DIntArray() {
        this.oldArray = new int[0];
    }

    DIntArray(int[] mass) {
        this.oldArray = mass;
    }

    DIntArray(int[] mass, int num, int pos) {
        this.oldArray = mass;
        add(num);
        System.out.println(Arrays.toString(oldArray));
        atInsert(pos, num);
        System.out.println(Arrays.toString(oldArray));
        atDelete(pos);
        System.out.println(Arrays.toString(oldArray));
        at(pos);
        System.out.println(Arrays.toString(oldArray));
    }

    public void add(int num) {
        newArray = new int[oldArray.length + 1];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        newArray[newArray.length - 1] = num;
        oldArray = newArray;
    }

    public void atInsert(int pos, int num) {
        newArray = new int[oldArray.length + 1];
        System.arraycopy(oldArray, 0, newArray, 0, pos);
        newArray[pos] = num;
        System.arraycopy(oldArray, pos, newArray, pos + 1, oldArray.length - pos);
        oldArray = newArray;
    }

    public void atDelete(int pos) {
        newArray = new int[oldArray.length - 1];
        System.arraycopy(oldArray, 0, newArray, 0, pos);
        System.arraycopy(oldArray, pos, newArray, pos - 1, oldArray.length - pos);
        oldArray = newArray;
    }

    public int at(int pos) {
        this.num = oldArray[pos];
        return this.num;
    }


    public static void main(String[] args) {

        int[] mass = {5, 8, 15, 28, 99, 33, 0, -2};
        int[] massa = {15, 28, 35, 48, 59, 63, 70, -82};
        DIntArray opera = new DIntArray(mass);
        DIntArray second = new DIntArray(massa, 123, 4);
//        opera.add(777);
//        opera.atInsert(5, 66);
//        opera.atDelete(3);
//        System.out.println(Arrays.toString(opera.newArray));
//        System.out.println(Arrays.toString(second.newArray));
//        opera.atDelete(4);
////        opera.at(5);
////        System.out.println(opera.at(5));


    }
}
