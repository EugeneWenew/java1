package ru.progwards.java1.lessons.bigints;

class ShortInteger extends AbsInteger {         //short class
    short num;

    public ShortInteger(short num) {
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

//    public short shortGetNum(int num) {
//        return (short) num;
//    }
}