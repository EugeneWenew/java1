package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value) {     //переменная byte
        int result = 0;                         //инициализация результата
        if (value > 0) {
            while (value > 0) {                     //цикл прогона всего числа
                result += (byte) (value & 0b1);      //выделение правого БИТА переменной value c инкрементом результата
                value = ((byte) (value >> 1));      //сдвиг вправо с заполнением нулями
            }
            return result;
        } else if (value < 0) {
            for (int i = 0; i < 8; i++) {
                result += (byte) (value & 0b1);
                value = ((byte) (value >> 1));
            }
            return result;
        } else return 0;


    }

    public static void main(String[] args) {
        byte value = (byte) 0b10000000;
        System.out.println(sumBits(value));     //переменная byte
    }
}
