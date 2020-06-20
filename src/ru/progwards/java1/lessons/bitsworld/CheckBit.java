package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber) {
        int result = 0;
        for (int i = 0; i <= bitNumber; i++) {

            if (i == bitNumber - 1) {
                result = (byte) (value & 0b1);

            }
            value = ((byte) (value >>> 1));


        }
        return result;
    }

    public static void main(String[] args) {
        byte value = (byte) 0b10100000;
        System.out.println(checkBit(value, 8));
    }
}
