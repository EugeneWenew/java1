package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value) {
        int result = 0;
        int intermediate = 0;

        while (value > 0) {
            result += (value & 0b00000001);
            value = (byte) (value >> 1);

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumBits((byte) 7));
    }
}
