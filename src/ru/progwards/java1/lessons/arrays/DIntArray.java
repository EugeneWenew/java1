package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] oldArray;

    DIntArray() {
    }

    public void add(int num) {
        int[] newArray = new int[oldArray.length + 1];
        newArray[newArray.length] = num;
    }

    public void atInsert(int pos, int num) {
        int[] newInsArray = new int[oldArray.length + 1];
        for (int i = 0; i < newInsArray.length; i++) {
            if (i == pos - 1) newInsArray[i] = num;
            if (i > pos) newInsArray[i + 1] = oldArray[i];
        }
    }

    public void atDelete(int pos) {
        int[] newDelArray = new int[oldArray.length - 1];
        for (int i = 0; i < newDelArray.length; i++) {
            if (i == pos - 1) newDelArray[i] = oldArray[i + 1];
            if (i > pos) newDelArray[i - 1] = oldArray[i];
        }
    }

    public int at(int pos) {
        return oldArray[pos];
    }
}
