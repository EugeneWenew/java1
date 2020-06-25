package ru.progwards.java1.lessons.interfaces;


public class Animal implements FoodCompare {
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

    public double getFood1kgPrice() {

        switch (getFoodKind()) {
            case HAY:
                return 20;
            case CORN:
                return 50;
            case UNKNOWN:
            default:
                return 0;
        }

    }
    @Override
    public int compareFoodPrice(Animal aminal) {
        return Double.compare(this.getFoodPrice(), aminal.getFoodPrice());
    }

    public double getFoodPrice() {
        return this.calculateFoodWeight() * this.getFood1kgPrice();

    }

    enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }

    enum FoodKind {UNKNOWN, HAY, CORN}

    public String toString() {
        return ("I am " + this.getKind() + ", eat " + this.getFoodKind());
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
        return ("I am " + this.getKind() + ", eat " + this.getFoodKind() + " " + this.calculateFoodWeight());
    }


    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (anObject == null || getClass() != anObject.getClass()) return false;
        Animal animal = (Animal) anObject;
        return Double.compare(animal.getWeight(), getWeight()) == 0;
    }

}