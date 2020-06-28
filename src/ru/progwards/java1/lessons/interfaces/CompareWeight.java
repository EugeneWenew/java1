package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {

    public enum CompareResult {LESS, EQUAL, GREATER}

    //    public CompareWeight[] a;


    /* default*/
    CompareResult compareWeight(CompareWeight smthHasWeigt);



    public double getWeight();


    public static void sort(CompareWeight[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                CompareWeight swap;
                if (a[i].getWeight() > a[j].getWeight()) {
                    swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }

        }
    }

}









  /*{
        int doubcom = Double.compare(this.getWeight(), smthHasWeigt.getWeight());             //2
        switch (doubcom) {
            case (-1):
                return CompareWeight.CompareResult.LESS;
            case (0):
                return CompareWeight.CompareResult.EQUAL;


        }
        return CompareWeight.CompareResult.GREATER;

    }   */          //3