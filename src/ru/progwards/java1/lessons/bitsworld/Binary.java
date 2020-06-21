package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;

    public Binary(byte num) {
        this.num = num;
        toString();
    }

    public String toString() {
        String value = "";
        int result = num;
        while (result > 0) {
            value += result % 2;
            result = result / 2;
        }

        return value;
    }

    public static void main(String[] args) {
        Binary VAL = new Binary((byte) 15);
        System.out.println(VAL.toString());
    }
}
