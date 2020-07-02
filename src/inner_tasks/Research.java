package inner_tasks;

public class Research {
    public static final void researchWeigh(HasWeight smthHasWeight) {
        System.out.println(smthHasWeight.getWeight());
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Insect insect = new Insect();

        researchWeigh(animal);
        researchWeigh(insect);

        animal.method(insect);
    }
}
