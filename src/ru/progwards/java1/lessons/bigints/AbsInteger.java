package ru.progwards.java1.lessons.bigints;

abstract public class AbsInteger {
    abstract int num;


    @Override
    public String toString() {
        return "AbsInteger{" +
                "num=" + num +
                '}';
    }

    public getType(int num) {
        ByteInteger byIn = new ByteInteger(num);
        if (num < 127 | num > -128) return byIn.anByteGetNum();
    }


    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
    }


    class ByteInteger extends AbsInteger {          //byte class
        byte num;

        public ByteInteger(byte num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "ByteInteger{" +
                    "num=" + num +
                    '}';
        }

        public byte anByteGetNum(int num) {
            return (byte) num;
        }
    }

    class ShortInteger extends AbsInteger {         //short class
        short num;

        public ShortInteger(short num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "ShortInteger{" +
                    "num=" + num +
                    '}';
        }

        public short anShortGetNum(int num) {
            return (short) num;
        }
    }

    class IntInteger extends AbsInteger {       //int class
        int num;

        public IntInteger(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "IntInteger{" +
                    "num=" + num +
                    '}';
        }

        public int anIntGetNum(int num) {
            return (int) num;
        }
    }
}
