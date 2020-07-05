package ru.progwards.java1.lessons.bigints;

class ByteInteger extends AbsInteger {          //byte class
    byte num;

    public ByteInteger(byte num) {
        this.num = num;
    }

    @Override
    public int intValue() {
        return num;
    }

    @Override
    public String toString() {
        return ""+num;
    }


//    public byte byteGetNum(int num) {
//        return (byte) num;
//    }


}