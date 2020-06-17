package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private int N;
    int notGetter;
    boolean[] sieve;
    static int pole = 5;

    public Eratosthenes(int M) {
        this.N = M;
        this.sieve = new boolean[N];
        Arrays.fill(sieve, true);
        sift();
    }

    public int getN() {
        return N;
    }

    private void sift() {
        int i, j;
        for (i = 2; i < sieve.length; i++) {
            for (j = 2; j < sieve.length; j++) {
                if (i * j <= 3) {
                    sieve[i * j] = true;
                    continue;
                }

                while ((sieve.length - 1) >= i * j) {
                    sieve[j * i] = false;
                    j++;
                }
            }
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes era = new Eratosthenes(20);

        System.out.println("N= " + era + ", pole = " + Arrays.toString(era.sieve));
        Eratosthenes.pole = 33;
        System.out.println(era.N);
        System.out.println(era.isSimple(15));
    }

    @Override
    public String toString() {
        return "Eratosthenes{" +
                "N=" + N +
                '}';
    }


}

