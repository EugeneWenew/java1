package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {
    public enum CompareResult {LESS, EQUAL, GREATER}
//    public CompareWeight[] a;


    /* default*/
    CompareResult compareWeight(CompareWeight smthHasWeigt); /*{
        int doubcom = Double.compare(this.getWeight(), smthHasWeigt.getWeight());             //2
        switch (doubcom) {
            case (-1):
                return CompareWeight.CompareResult.LESS;
            case (0):
                return CompareWeight.CompareResult.EQUAL;


        }
        return CompareWeight.CompareResult.GREATER;

    }   */          //3


    public double getWeight();

    public static void sort(CompareWeight[] a);

}
