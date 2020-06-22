public class Task7 {
    Grade value;

    public static void main(String[] args) {
        System.out.println(1 & 0);
        System.out.println(1 | 0);
        System.out.println(1 & 1);
        System.out.println(~1);         // 0
        System.out.println(1 | 1);
        System.out.println(intToGrade(5));

        //  int result = value & 0b1;


    }

    enum Grade {
        VERYBAD, BAD, SATISFACTORILY, GOOD, EXCELLENT, NOTDEFINED
    }

    static Grade intToGrade(int grade) {
        switch (grade) {
            case 1:
                return Grade.VERYBAD;
            case 2:
                return Grade.BAD;
            case 3:
                return Grade.SATISFACTORILY;
            case 4:
                return Grade.GOOD;
            case 5:
                return Grade.EXCELLENT;
            default:
                return Grade.NOTDEFINED;
        }


    }

}



