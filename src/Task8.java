import java.util.Objects;

public class Task8 {
}

/*
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


    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (anObject == null || getClass() != anObject.getClass()) return false;
        Rectangle rectangle = (Rectangle) anObject;
        return Double.compare(rectangle.area(), area()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}


    Правильный ответ: public class Number implements ICompare {
...
} → можно написать ICompare i = new Number();, public abstract class Number {
...
} → нельзя создать экземпляр этого класса, public class Number implements Comparable {
...
} → этот класс обязан реализовать все методы из Comparable, public final class Number {
...
} → у этого класса не может быть потомков, public abstract final class Number {
...
} → так нельзя, компилятор выдаст ошибку
        Правильный ответ: Располагается внутри какого-либо класса и не содержит модификатор static → внутренний класс, Разновидность локального класса, но существует сам по себе, без переменной → анонимный класс, Разновидность внутреннего класса, располагается внутри любого метода → локальный класс, Располагается внутри какого-либо класса и содержит модификатор static → вложенный класс
        Правильные ответы: невозможно создать экземпляр абстрактного класса, класс-наследник абстрактного класса либо сам должен быть абстрактным, либо реализовать все абстрактные методы, interface позволяет использовать унифицированный доступ к классам, не связанным иерархией наследования

class Circle {
    private double radius;
}

    по параметру radius;

public boolean equals(Object o) {
        [if (this == o) return true;]
        [if (o == null) return false;]
        [if( GetClass != o.GteClass()) return false;]
        [double radius = ((Circle)o).radius;]
        return [Double.compareTo(this,radius, radius) == 0;]
        }

        Правильные ответы: Хеш-код предназначен для повышение быстродействия при поиске, добавлении и удалении элементов в коллекциях, public boolean equals(Object o) обладает свойствами - транзитивность, рефлексивность и симметричность, a.equals(null) всегда false


Правильный ответ: public class Person {
	static class SaveRec {
           ....
  → Внутри класса Person можно написать new SaveRec();,
public class Animal {
public class SaveRec {
           ....
  → Снаружи класса Animal можно написать new Animal().new SaveRec();,
public class Person {
   class SaveRec {
           ....
  → Внутри класса Person можно написать newPerson().new SaveRec();, public static class Animal {
public class SaveRec {
           ....
  → Так написать нельзя, компилятор выдаст ошибку,
public class Animal {
public static class SaveRec {
           ....
  → Снаружи класса Animal можно написать new Animal.SaveRec();
                   */