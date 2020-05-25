package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
        System.out.println(calculateAccuracy(6371.2));
    }
    public static double volumeBallDouble(double radius){
        double fourThreePi = 4d/3d*314d/100d;
        return (fourThreePi*radius);
    }
    public static float volumeBallFloat(float radius){
        float fourThreePi = 4f/3f*314f/100f;
        return (fourThreePi*radius);
    }
    public static double calculateAccuracy(double radius){
        return volumeBallDouble(radius)-volumeBallFloat((float)radius);
    }
}
