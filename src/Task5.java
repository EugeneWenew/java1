public class Task5 {
}
/*
public class Person {
    private String name;
    private int age;
    private String country;

    public Person() {
        country = "RU";
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}

public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }

    public int set(int num) {
        result = num;
        return result;
    }

    public int add(int num) {
        result += num;
        return result;
    }

    public int sub(int num) {
        result -= num;
        return result;
    }

    public int getResult() {
        return result;
    }
}
*/

public class Point2D {
    int x;
    int y;

    Point2D() {
    }

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return (x + "," + y);
    }
}

public class Point3D extends Point2D {
    private int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        super.toString();
        return (x + "," + y + "," + z);
    }
}



