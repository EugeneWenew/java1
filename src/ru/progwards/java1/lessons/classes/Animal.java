package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }

    enum FoodKind {UNKNOWN, HAY, CORN}

    public String toString() {
        return ("I am" + this.getKind() + ", eat" + this.getFoodKind());
    }

    public double getWeight() {
        return this.weight;
    }

    public double getFoodCoeff() {
        switch (getKind()) {
            default:
                return 0.02;
        }
    }

    public double calculateFoodWeight() {
        return this.getWeight() * this.getFoodCoeff();
    }

    public String toStringFull() {
        return ("I am" + this.getKind() + ", eat" + this.getFoodKind() + this.calculateFoodWeight());
    }


}

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

public class Hamster extends Animal {
    Hamster(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    @Override
    public Animal.FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        super.getFoodCoeff();
        return 0.03;
    }

}

public class Duck extends Animal {
    Duck(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }

    @Override
    public Animal.FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        super.getFoodCoeff();
        return 0.04;
    }
}
