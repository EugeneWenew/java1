package ru.progwards.java1.lessons.bigints;

abstract public class AbsInteger {
    abstract int num;

    abstract public int intValue();

    @Override
    public String toString() {
        return "AbsInteger{" +
                "num=" + num +
                '}';
    }

    public int intValue(int num) {
        return (int) num;
    }

    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        int res = num1.intValue() + num2.intValue();
        if (res <= 127 & res >= -128) return (byte) res;
        else if (res <= 32767 & res >= -32768) return (short) res;
        else return (int) res;
    }
}
