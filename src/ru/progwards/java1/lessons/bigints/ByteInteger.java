package ru.progwards.java1.lessons.bigints;

class ByteInteger extends AbsInteger {          //byte class
    byte num;

    public ByteInteger(byte num) {
        this.num = num;
    }

    @Override
    public int intValue() {
        int Num = this.num;
        return (byte) Num;
    }

    @Override
    public String toString() {
        return "ByteInteger{" +
                "num=" + num +
                '}';
    }


//    public byte byteGetNum(int num) {
//        return (byte) num;
//    }


}