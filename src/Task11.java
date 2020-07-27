import java.io.IOException;

public class Task11 {
    public void doSomething(int n) throws IOException {
    }

    public void test(int n) throws IOException{
        try {
            doSomething(n);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
//            try {
//                e.getMessage();
//
//            } catch (IOException ioException) {
//                ioException.getMessage();
//            }
        } finally {
            System.out.println("finally executed");

        }
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