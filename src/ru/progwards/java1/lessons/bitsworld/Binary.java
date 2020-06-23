package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;

    public Binary(byte num) {
        this.num = num;
        toString();
    }

    public String toString() {
        if (num == 0) return "00000000";
        String value = "";
        int result = num;
        for (int i = 0; i < 8; i++) {
            value = (result & 0b1) + value;
            result >>= 1;

        }


        return value;
    }

    public static void main(String[] args) {
        Binary VAL = new Binary((byte) 7);
        System.out.println(VAL.toString());
    }
}
