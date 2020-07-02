public class Task9 {
    class Person {
        public String name;

        public Person(String name) {
            this.name = name;
        }
    }


    abstract class PersonCompare {
        public int compare(Person p1, Person p2) {
            return 0;
        }
    }


    PersonCompare personCompare = new PersonCompare() {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.name.compareTo(p2.name);
        }
    };


}
//
//
//class FiguresComparatorArea extends CompareGr {
//    @Override
//    boolean greater(Figure figure1, Figure figure2) {
//        return figure1.area() > figure2.area();
//    }
//}
//    FiguresComparatorArea fca = new FiguresComparatorArea();
//
//    FiguresCompare fcArea = new FiguresCompare(figures, fca);
//
//
//
//
//    FiguresCompare fcArea = new FiguresCompare(figures, new CompareGr() {
//        @Override
//        boolean greater(Figure figure1, Figure figure2) {
//            return figure1.area() > figure2.area();
//        }
//    }
//    );
//
//















