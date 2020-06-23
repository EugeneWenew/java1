import java.util.Objects;
//
//class Rectangle {
//    private double a;
//    private double b;
//
//    public Rectangle(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public double area() {
//
//        return a * b;
//    }
//
//
//    @Override
//    public boolean equals(Object anObject) {
//        if (this == anObject) return true;
//        if (anObject == null || getClass() != anObject.getClass()) return false;
//        Rectangle rectangle = (Rectangle) anObject;
//        return Double.compare(rectangle.area(), area()) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(a, b);
//    }
//}