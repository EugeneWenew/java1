package inner_tasks;

public class Animal implements HasWeight {
    String name;
    double weight = 1000;

    @Override
    public double getWeight() {
        return weight;
    }

    void method(HasWeight smthHasWeight) {
        if (weight > smthHasWeight.getWeight())
            System.out.println("Я тяжелее кого-то");
        else
            System.out.println("Я легче кого-то");
    }
}
