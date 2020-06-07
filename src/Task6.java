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


public class Task6 {
    public static void main(String[] args) {

        int a[] = {11, 22, 33};
        Task6 m1 = new Task6();
        System.out.println(m1.sumArrayItems(a));
        System.out.println();
        Rectangle rec1 = new Rectangle(5, 6);
        Rectangle rec2 = new Rectangle(7, 8);
        System.out.println(rec1.compareTo(rec2));

    }

    public int sumArrayItems(int[] a) {
        int res = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            res += a[i];
        }
        return res;
    }
}

class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {

        return a * b;
    }

    public int compareTo(Rectangle anRectangle) {
        Double s1, s2;                                  // Обертки
        Rectangle rec1 = new Rectangle(this.a, this.b);
        Rectangle rec2 = new Rectangle(anRectangle.a, anRectangle.b);
        s1 = rec1.area();
        s2 = rec2.area();
        return s1.compareTo(s2);
    }
}







