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
        int counter = 0;
        while (result > 0) {
            value += result % 2;
            result = result / 2;
            counter++;
        }
//        switch (counter) {
//            case 1:
//                return "0000000" + value;
//            case 2:
//                return "000000" + value;
//            case 3:
//                return "00000" + value;
//            case 4:
//                return "0000" + value;
//            case 5:
//                return "000" + value;
//            case 6:
//                return "00" + value;
//            case 7:
//                return "0" + value;
//        }


        return value;
    }

    public static void main(String[] args) {
        Binary VAL = new Binary((byte) 3);
        System.out.println(VAL.toString());
    }
}
