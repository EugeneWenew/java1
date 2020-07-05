package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;

public class ArrayInteger {
    BigInteger value;
    byte[] digits;

    ArrayInteger(int n) {
        this.digits = new byte[n];
    }

    void fromInt(BigInteger value) {
        String starr = value.toString(10);
        for (int i = 0; i < starr.length(); i++) {
            digits[i] = starr.getBytes()[i];
        }


    }

    BigInteger toInt() {
        int RES;
        String str = "";

        for (int i = 0; i < digits.length; i++) {
            str+= digits[i];
        }
        RES = Integer.parseInt(str);
        return new BigInteger(RES);

    }

    boolean add(ArrayInteger num) {

    }
}
