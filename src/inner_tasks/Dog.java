package inner_tasks;

public class Dog implements Speaking, Eating {
    @Override
    public String say() {
        return "Гав";
    }

    @Override
    public String eat() {
        return "Мясо";
    }



//    public static final void looking(Speaking something){
//
//        System.out.println(something.say());
//    }
//
//
//
//
//    public static void main(String[] args) {
//        Dog taxa = new Dog();
//        System.out.println(taxa.number());
//        Goat kozel = new Goat();
//        looking(taxa);
//        looking(kozel);
//
//    }



}

