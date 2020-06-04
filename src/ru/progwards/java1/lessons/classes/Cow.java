package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
    Cow(double weight) {
        super(weight);
    }

    @Override
    public Animal.AnimalKind getKind() {
        return AnimalKind.COW;
    }

    @Override
    public Animal.FoodKind getFoodKind() {
        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff() {
        super.getFoodCoeff();
        return 0.05;
    }
}

