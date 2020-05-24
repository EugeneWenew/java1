public class Task2 {
    public static void printJava() {
        String str1 = "Хорошо идут дела";
        String str2 = "Изучаю Java я!";
        String str3 = " ";
        System.out.println(str1);
        System.out.println(str2);
        System.out.print(str1);
        System.out.print(str3);
        System.out.println(str2);
        System.out.print(str2);
        System.out.print(str3);
        System.out.println(str1);

    }

    public static int subtraction(int x, int y) {
        System.out.println("Вызвана функция subtraction() с параметрами x = " + x + ", y = " + y);
        return x - y;
    }

    public static int addition(int x, int y) {
        System.out.println("Вызвана функция addition() с параметрами x = " + x + ", y = " + y);
        return x + y;
    }

    public static int multiplication(int x, int y) {
        System.out.println("Вызвана функция multiplication() с параметрами x = " + x + ", y = " + y);
        return x * y;
    }

    public static void calculation() {
        int c;
        int a = 34;
        int b = 55;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        c = addition(a, b);
        System.out.println("a + b = " + c);
        c = subtraction(a, b);
        System.out.println("a - b = " + c);
        c = multiplication(a, b);
        System.out.println("a * b = " + c);

    }

    public static void main(String[] args) {
        printJava();
        subtraction(45, 12);
        subtraction(23, 55);
        addition(128, 787);
        addition(528, 387);
        multiplication(124, 87);
        multiplication(1528, 3);
        //calculation();
    }

}
/*
    byte b1 = 123;
    short s1 = 32023;
    int i1 = 65432;
    long l1 = 123456789012345L;
    float fl = 1.22278F;
    double pi = 3.1415926535;
    double koe = 1.5e7;
    String message = "Запись фильма \"Матрица\" находится в файле C:\\video\\matrix.avi" */