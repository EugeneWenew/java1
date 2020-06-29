package ru.progwards.java1.lessons.classes;

class Animal {
    double weight;

    enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }

    enum FoodKind {UNKNOWN, HAY, CORN}

    public Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }


    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }


    public String toString() {
        return ("I am " + this.getKind() + ", eat " + this.getFoodKind());
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


}

