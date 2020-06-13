package ru.progwards.java1.lessons.arrays;

import java.time.chrono.Era;
import java.util.Arrays;

public class Eratosthenes {
    int N;
    boolean[] sieve = new boolean[N];


    public static void main(String[] args) {
        Eratosthenes era = new Eratosthenes(50);
        System.out.println(era);
    }

    public Eratosthenes() {
    }

    public Eratosthenes(int N) {
        this.N = N;
        boolean[] sieve = new boolean[N];
        Arrays.fill(sieve, true);
        sift();

    }

    private void sift() {
        int i, j;
        for (i = 2; i < N - 1; i++) {
            for (j = 2; j < N - 1; j++) {
                while ((N - 1) >= i * j) {
                    sieve[j * i] = false;
                }
            }
        }
    }
}

