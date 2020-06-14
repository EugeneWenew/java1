package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    int N;
    Boolean[] sieve;

    public Eratosthenes(int N) {
        this.N = N;
        this.sieve = new Boolean[N];
        Arrays.fill(sieve, true);
        sift();
    }

    private void sift() {
        int i, j;
        for (i = 1; i < sieve.length; i++) {
            for (j = 1; j < sieve.length; j++) {
                if (i * j <= 3) continue;

                while ((sieve.length - 1) >= i * j) {
                    sieve[j * i] = false;
                    j++;
                }
            }
        }
    }

    public boolean isSimple(int n){
        return this.sieve[sieve.length-1];
    }


    public static void main(String[] args) {
        Eratosthenes era = new Eratosthenes(20);
        System.out.println(era.isSimple(7));
    }
}

