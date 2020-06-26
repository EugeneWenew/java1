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


    public static void sort(CompareWeight[] a) {
        CompareWeight SWAP;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    SWAP = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = SWAP;
                }
            }
        }
    }

}

