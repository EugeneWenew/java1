package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static void main(String[] args) {
                int fibo15 = 15;
        for (int i = 0; i <= fibo15; i++) {
            if (fiboNumber(i) <= 100) {
                for (int n = 0; fiboNumber(n) <= fiboNumber(i); n++) {
                    if (isGoldenTriangle(fiboNumber(i), fiboNumber(i), fiboNumber(n))) {
                        System.out.println(fiboNumber(i) + " " + fiboNumber(i) + " " + fiboNumber(n));
                    }
                }
            }
        }
    }

    public static boolean containsDigit(int number, int digit) {
        int i = number;
        int part = 0;
        boolean res = false;
        while (i > 0) {
            part = i % 10;
            i = i / 10;
            if (digit == part)
                res = true;
            else continue;
        }
        if (digit == 0 & number == 0)
            res = true;
        return res;
    }

    public static int fiboNumber(int n) {
        int i1 = 1;
        int i2 = 1;
        int i3 = 0;
        int count = 3;
        while (count <= n) {
            i3 = i1 + i2;
            i1 = i2;
            i2 = i3;
            count++;
        }
        if (n == 0 | n == 1 | n == 2) i3 = 1;
        return i3;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        double A = a;
        double B = b;
        double C = c;
        if (((A == B) & ((1.61703 < (A / C)) & ((A / C) < 1.61903))) | ((B == C) & ((1.61703 < (B / A)) & ((B / A) < 1.61903))) | ((A == C) & ((1.61703 < (A / B)) & ((A / B) < 1.61903))))
            return true;
        else return false;
    }
}
