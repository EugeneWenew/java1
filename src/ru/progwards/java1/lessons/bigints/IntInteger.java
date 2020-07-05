package ru.progwards.java1.lessons.bigints;


class IntInteger extends AbsInteger {       //int class
    int num;

    public IntInteger(int num) {
        this.num = num;
    }

    @Override
    public int intValue() {
        return (int) this.num;
    }

    @Override
    public String toString() {
        return "IntInteger{" +
                "num=" + num +
                '}';
    }

//       public int intGetNum(int num) {
//          return (int) num;
//      }
}

