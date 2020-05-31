package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {


        System.out.println(maxSide(1, 4, 3));
        System.out.println(minSide(4, 5, 2));
        System.out.println(isEquilateralTriangle(2, 2, 2));

    }

    public static int maxSide(int a, int b, int c) {
        if (a > b & a > c) return a;
        else if (b > a & b > c) return b;
        else return c;
    }

    public static int minSide(int a, int b, int c) {
        if (a < b & a < c) return a;
        else if (b < a & b < c) return b;
        else return c;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        if (a == b & a == c) return true;
        else return false;
    }

}
