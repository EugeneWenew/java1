package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat((float)6371.2));
        System.out.println(calculateAccuracy(6371.2));
    }
    public static double volumeBallDouble(double radius){
        double fourThreePi = (4./3)*(314./100);
        return (fourThreePi*Math.pow(radius,3));
    }
    public static float volumeBallFloat(float radius){
        double fourThreePi = (4./3)*(314./100);
        return (float)(fourThreePi*Math.pow(radius,3));
    }
    public static double calculateAccuracy(double radius){
        return volumeBallDouble(radius)-volumeBallFloat((float)radius);
    }
}
