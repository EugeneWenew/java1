package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    int N;
    Boolean[] sieve = new Boolean[N];

    public Eratosthenes(int N) {
        this.N = N;
        sieve = new Boolean[N];
        Arrays.fill(sieve, true);
        sift();
    }

    private void sift() {
        int i, j;
        for (i = 1; i < sieve.length - 1; i++) {
            for (j = 1; j < sieve.length - 1; j++) {
                if (i * j <= 3) continue;
                ;
                while ((sieve.length - 1) >= i * j) {
                    sieve[j * i] = false;
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Eratosthenes era = new Eratosthenes(20);
        System.out.println(Arrays.toString(era));
    }
}

