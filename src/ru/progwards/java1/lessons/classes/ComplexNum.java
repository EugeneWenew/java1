package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;

    double i = Math.sqrt(-1);
    ComplexNum num1 = new ComplexNum(10, 10);
    ComplexNum num2 = new ComplexNum(20, 20);

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public String toString() {
        return (this.a + "+" + this.b + "i");
    }

    public ComplexNum add(ComplexNum num) {

        ((num1.a + num2.a) + (num1.b + num2.b));
        return add(num1, num2).toString();

    }
}
