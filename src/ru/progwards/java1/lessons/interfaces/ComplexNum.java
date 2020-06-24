package ru.progwards.java1.lessons.interfaces;


public class ComplexNum {
    int a;
    int b;


    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public String toString() {
        return (this.a + "+" + this.b + "i");
    }

    public ComplexNum add(ComplexNum num) {
        int a1, b1;
        a1 = this.a + num.a;
        b1 = this.b + num.b;
        return new ComplexNum(a1, b1);

    }

    public ComplexNum sub(ComplexNum num) {
        int a1, b1;
        a1 = this.a - num.a;
        b1 = this.b - num.b;
        return new ComplexNum(a1, b1);
    }

    public ComplexNum mul(ComplexNum num) {
        int a1, b1;
        a1 = (this.a * num.a - this.b * num.b);
        b1 = (this.b * num.a + this.a * num.b);
        return new ComplexNum(a1, b1);
    }

    public ComplexNum div(ComplexNum num) {
        int a1, b1;
        a1 = ((this.a * num.a + this.b * num.b) / (num.a * num.a + num.b * num.b));
        b1 = ((this.b * num.a - this.a * num.b) / (num.a * num.a + num.b * num.b));
        return new ComplexNum(a1, b1);
    }

    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(11, 12);
        ComplexNum num2 = new ComplexNum(22, 33);
        System.out.println(num1.add(num2));
        System.out.println(num2.sub(num1));
        System.out.println(num2.mul(num1));
        System.out.println(num2.div(num1));
    }
}