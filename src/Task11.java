import java.io.IOException;
import java.util.Scanner;

public class Task11 {


    public void doSomething(int n) throws IOException {
    }

    public void test(int n) throws IOException {
        try {
            doSomething(n);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            System.out.println("finally executed");

        }
    }

    public void scanLines() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if (str.contains("Привет")) {
                    System.out.println("Здравствуйте!");
                } else if (str.contains("как дела")) {
                    System.out.println("Хорошо");
                } else if (str.contains("/stop")) {
                    return;
                } else {
                    System.out.println(str);
                }
            }
        }
    }

    public static void main(String[] args) {

        Task11 prov = new Task11();
//        prov.scanLines();
        System.out.println(prov.invertWords("буря матом небо кроет"));
    }


//    кроет.небо.мглою.Буря.              .слово.слово
//    кроет.небо.мглою.Буря


    String invertWords(String sentence) {
        String res = "";
        if ("".equals(sentence)) return "";
        StringBuilder strBild = new StringBuilder();

        for (String str : sentence.split(" ")) {
            strBild.insert(0, str);
            strBild.insert(0, ".");
//            res = str + "." + res;
        }

        return strBild.substring(1);
    }
}


//
//    public void test(int n) throws IOException{
//        try {
//            doSomething(n);
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//            throw e;
//        } finally {
//            System.out.println("finally executed");
//        }
//    }
//
//    Правильный ответ:
//        doExceptions 1
//        Exception in try (suppressed)
//        Exception in finally
//        → неверный вариант,
//        doExceptions 1
//        doExceptions 2
//        Exception in finally
//        → значение-параметра = 1,
//        doExceptions 1
//        Exception in finally
//        Exception in try (suppressed)
//        → значение-параметра = 0