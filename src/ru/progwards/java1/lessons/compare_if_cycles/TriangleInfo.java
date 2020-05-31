package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static void main(String[] args) {
        System.out.println(isTriangle(4, 5, 6));
        System.out.println(isRightTriangle(3, 4, 5));
        System.out.println(isIsoscelesTriangle(5, 5, 6));

    }

    public static boolean isTriangle(int a, int b, int c) {
        if ((a < b + c) & (b < a + c) & (c < a + b)) return true;
        else return false;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        if ((a == Math.sqrt(b * b + c * c)) | (b == Math.sqrt(a * a + c * c)) | (c == Math.sqrt(a * a + b * b)))
            return true;
        else return false;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (a == b | b == c | a == c) return true;
        else return false;
    }
}
