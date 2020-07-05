package ru.progwards.java1.lessons.bigints;


class IntInteger extends AbsInteger {       //int class
    int num;

    public IntInteger(int num) {
        this.num = num;
    }

    @Override
    public int intValue() {
        return num;
    }

    @Override
    public String toString() {
        return ""+num;
    }
}

