public class TestCLass {
    public static void main(String[] args) {
        int x = 9, y = 9;

        for (y = y; y > 0; y--) {
            System.out.println(y);
            for (x = x + (x % y); x > 0; x = x - 3) {
                System.out.print(x + " ");

            }
            System.out.println("");

        }

    }
}
