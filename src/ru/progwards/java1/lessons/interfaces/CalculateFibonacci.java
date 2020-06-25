package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

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
        else if (n==i3) return n;
        else if (n!=i3) lastFibo = i3;
        return i3;
    }

    public static class CacheInfo {

        public int n;
        public int fibo;

        public static CacheInfo getLastFibo() {
            return lastFibo;
        }

        public static void clearLastFibo() {
            lastFibo = null;
        }
    }
}
