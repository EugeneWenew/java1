public class Task3 {
    public static void main(String[] args) {
        Double num = 3.14;
        System.out.println(fractional(num));

    }

    static double fractional(double num) {
        Integer int1 = Integer.valueOf((int) num);
        Double doub1 = Double.valueOf(num);
        return doub1 - int1;
    }
}
