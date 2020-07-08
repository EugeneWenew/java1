package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println(reverseDigits(569));
    }

    public static int reverseDigits(int number) {
        int num = number;
        int hun = num % 10;
        int dec = num % 100 - hun;
        int units = num / 100;
        return (hun * 100 + dec + units);




    }
}
