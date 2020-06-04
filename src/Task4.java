public class Task4 {
    public static void main(String[] args) {
        /*System.out.println(addAsStrings(14256, 908));
        System.out.println(textGrade(102));
        System.out.println(factorial(6));*/
        System.out.println(!(2*2 == 5));
        System.out.println(true && false || true);
        System.out.println(2*2 == 5 && 2*2 == 4);
        System.out.println(true && false);
        System.out.println(true || false);








    }

    static int addAsStrings(int n1, int n2) {
        Integer int1 = n1;
        Integer int2 = n2;
        String str1 = int1.toString();
        String str2 = int2.toString();
        int int3 = Integer.parseInt(str1 + str2);
        return int3;
    }

    static String textGrade(int grade) {
        if (grade == 0) return "не оценено";
        else if (grade > 0 & grade <= 20) return ("очень плохо");
        else if (grade > 20 & grade <= 40) return ("плохо");
        else if (grade > 40 & grade <= 60) return ("удовлетворительно");
        else if (grade > 60 & grade <= 80) return ("хорошо");
        else if (grade > 80 & grade <= 100) return ("отлично");
        else return ("не определено");
    }


    static long factorial(long n) {
        long x = 1;
        for (long i = 1; i <= n; i++) {
            x = x * i;
        }
        return x;
    }


}
