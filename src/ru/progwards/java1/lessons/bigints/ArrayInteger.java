package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayInteger {
    byte[] digits;

    //    BigInteger value;
//
//    int volume;
//
//digits[].add(num)
    ArrayInteger(int n) {
        this.digits = new byte[n];
    }

    // установить свое значение, взяв его из value (уложить BigInteger во внутренний массив)
    void fromInt(BigInteger value) {
        int volume = 0;
        String starr = value.toString(10);
        for (int i = 0; i < starr.length(); i++) {
            String swap = starr.substring(i, i + 1);
            digits[i] = Byte.parseByte(swap);
            volume += 1;
            //     value.toByteArray();
        }
        digits = Arrays.copyOf(digits, volume);

    }
//    43
//    98765
//  [9] [8] [7] [6] [5]


    BigInteger toInt() {
        String str = "";

        for (int i = 0; i < digits.length; i++) {
            str = digits[i] + str;
        }

        return new BigInteger(str);     //biginteger/bigdecimal предпочтительно работать  со строками
    }


//             [0][1][2][3]
//    [1][0][0][0][9][9][9]

    //       "999"
    //digits[].add(num)

//    boolean add(ArrayInteger num) - сложить 2 числа, не используя BigInteger,
//    а  используя массив digits, результат поместить в экземпляр ArrayInteger,
//    у которого был вызван метод. При переполнении вернуть false, при этом само число сбросить в 0


    boolean add(ArrayInteger num) {
        //       проверка на длину массива по this
        int count = 0;
        if (digits.length < num.digits.length) {
            fromInt(new BigInteger("0"));
            return false;
        } else if (digits.length == num.digits.length) {
            for (int i = this.digits.length - 1; i >= 0; i--) {
                this.digits[i] = (byte) (this.digits[i] + num.digits[i]);
                if (this.digits[i] >= 10) {
                    if (i == 0) {
                        fromInt(new BigInteger("0"));
                        return false;
                    }

                    this.digits[i] -= 10;
                    this.digits[i - 1] += 1;


//                    if(this.digits[0]>=10) return false;
                }
            }
        } else {
            for (int i = this.digits.length - 1; i >= 0; i--) {
                this.digits[i] = (byte) (this.digits[i] + num.digits[num.digits.length - 1 - count]);
                count++;
                if (this.digits[i] >= 10) {
                    if (i == 0) {
                        fromInt(new BigInteger("0"));
                        return false;
                    }

                    this.digits[i] -= 10;
                    this.digits[i - 1] += 1;


                }

//        if (digits.length < num.digits.length) {
//            if (digits[0] + num.digits[num.digits.length - digits.length - 1] >= 10)
//                return false;
//
//        } else if (digits.length > num.digits.length) {
//            if (num.digits[0] + digits[digits.length - num.digits.length - 1] >= 10)
//                return false;
//        }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayInteger arr1 = new ArrayInteger(15);
        ArrayInteger arr2 = new ArrayInteger(20);
//        System.out.println(Arrays.toString(arr1.digits));
        arr1.fromInt(new BigInteger("28598"));
        System.out.println(Arrays.toString(arr1.digits));
        arr2.fromInt(new BigInteger("2035575"));
        System.out.println(Arrays.toString(arr2.digits));
        System.out.println(arr2.add(arr1));
        System.out.println(arr1.toString());


    }

    @Override
    public String toString() {
        return "ArrayInteger{" +
                "digits=" + Arrays.toString(digits) +
                '}';
    }

}
