package inner_tasks;

public class Person {
    static class Child1 {
        String hello() {

            return "привет";
        }
    }

    class Child2 {
        String hello() {
            return "servus";
        }
    }
}
//
//
//    Правильный ответ: public class Person {
//    static class SaveRec {
//           ....
//                   → Внутри класса Person можно написать new SaveRec();,



//        public class Animal {
//            public static class SaveRec {
//           ....
//                   → Снаружи класса Animal можно написать new Animal.SaveRec();



//                   , public static class Animal {
//                    public class SaveRec {
//           ....
//                   → Так написать нельзя, компилятор выдаст ошибку,




//                        public class Animal {
//                            public class SaveRec {
//           ....
//                   → Снаружи класса Animal можно написать new Animal().new SaveRec();,




//                                public class Person {
//                                    class SaveRec {
//           ....
//                   → Внутри класса Person можно написать newPerson().new SaveRec();