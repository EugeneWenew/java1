//int item = a[1];

//int a[];

//int a[][][];

// int []a = {10, 26, 12, 35};

//int []a = new int[10];

//int i = a.length;

//int a[][];
//int item = a[1][2];

//int a1[], a2[], a3[];
//int a[][] = {a1, a2, a3};


import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

//        int a[] = {11, 22, 33};
//        Task6 m1 = new Task6();
//        System.out.println(m1.sumArrayItems(a));
//        System.out.println();
//        Rectangle rec1 = new Rectangle(5, 6);
//        Rectangle rec2 = new Rectangle(7, 8);
//        System.out.println(rec1.compareTo(rec2));

//        int[] a1 = {1, 1, 1, 1, 3};
//        int[] a2 = new int[5];
//        Arrays.fill(a2, 1);
//        a2[4] = 3;
//        System.out.println(Arrays.equals(a1, a2));

//        int[] a1 = {12, 5, 0, 58, 36};
//        int[] a2 = Arrays.copyOf(a1, a1.length);
//        Arrays.sort(a2);
//        System.out.println(Arrays.equals(a1, a2));
//
//        int[] a1 = {12, 5, 0, 58, 36};
//        int[] a2 = Arrays.copyOf(a1, a1.length);
//        a2[2] = 0;
//        System.out.println(Arrays.equals(a1, a2));

//
//        String str1 = new String("12345");
//        String str2 = new String("12345");
//        System.out.println(str1.equals(str2));


//
//
//        Integer a = 1;
//        Integer b = 5;
//        System.out.println(a.compareTo(b));
//


//
//        String str1 = "12345";
//        String str2 = "12345";
//        System.out.println(str1 == str2);
////

        Integer a = 1;
        Integer b = 1;
        System.out.println(a.compareTo(b));

//
//
//
//        String str1 = new String("12345");
//        String str2 = new String("12345");
//        System.out.println(str1 == str2);
//
//
//
//
//        Integer a = 5;
//        Integer b = 1;
//        System.out.println(a.compareTo(b));
//

    }
    public int arrayMax(int[] a){
        if (a.length==0) return 0;
        Arrays.sort(a);
        return a[a.length-1];
    }

    public int sumArrayItems(int[] a) {
        int res = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            res += a[i];
        }
        return res;
    }
}

class Rectangle_6 {
    private double a;
    private double b;

    public Rectangle_6(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {

        return a * b;
    }

    public int compareTo(Rectangle_6 anRectangle) {
        Double s1, s2;                                  // Обертки
        Rectangle_6 rec1 = new Rectangle_6(this.a, this.b);
        Rectangle_6 rec2 = new Rectangle_6(anRectangle.a, anRectangle.b);
        s1 = rec1.area();
        s2 = rec2.area();
        return s1.compareTo(s2);
    }


}








