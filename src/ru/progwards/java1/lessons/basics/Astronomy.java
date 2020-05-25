package ru.progwards.java1.lessons.basics;


public class Astronomy {
    public static void main(String[] args) {
        System.out.println(sphereSquare(967.415));
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }

    public static Double sphereSquare(Double R) {
        return (4 * 3.14 * Math.pow(R, 2));
    }

    public static Double earthSquare() {
        double earthR = 6371.2;
        return sphereSquare(earthR);
    }

    public static Double mercurySquare() {
        double mercR = 2439.7;
        return sphereSquare(mercR);
    }

    public static Double jupiterSquare() {
        double jupR = 71492;
        return sphereSquare(jupR);
    }

    public static Double earthVsMercury() {
        return earthSquare() / mercurySquare();
    }

    public static Double earthVsJupiter() {
        return earthSquare() / jupiterSquare();
    }

}
