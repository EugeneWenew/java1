package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber) {
        int result = 0;
        for (int i = 0; i <= bitNumber; i++) {

            if (i == bitNumber) {
                result = (byte) (value & 0b1);

            }
            value = ((byte) (value >>> 1));


        }
        return result;
    }

    public static void main(String[] args) {
        byte value = (byte) 35;
        System.out.println(checkBit(value, 0));
    }
}
