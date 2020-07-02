package inner_tasks;

import java.math.BigDecimal;

public class Rectangle_9 {
    static class Rectangle {

        Rectangle(BigDecimal a, BigDecimal b) {
            this.a = a;
            this.b = b;
        }

        public BigDecimal a;
        public BigDecimal b;
    }

    boolean rectCompare(Rectangle r1, Rectangle r2) {
        BigDecimal s1,s2;
        s1 = r1.a.multiply(r1.b);
        s2 = r2.a.multiply(r2.b);
        return (s1.equals(s2));

    }
}
