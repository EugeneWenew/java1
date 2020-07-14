import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task10 {
    public Integer sqr(Integer n) {
        try {
            return n * n;
        } catch (NullPointerException e) {
            return -1;
        }
    }




//    Проброс это когда пробрасываем через метод - не обрабатываем в нём.
//    А бросить - это просто сгенерировать новое исключение.


    public String test(String filename) throws IOException {
        try {
            filename.toString();
            return "File processing";
        } catch (NullPointerException e) {
            throw new IOException("File not found");       //ВЫБРАСЫВание нового искключения
        }
    }


/*    Правильные ответы: Исключение - проблемы возникающие при выполнении кода, Исключения освобождают код от передачи информации о возникшей проблеме, Все исключения в Java описываются классами
Правильные ответы: Проверяемые исключения - компилятор требует наличия try-catch или throws, Непроверяемые исключения - потомки RuntimeException, Пробросить проверяемое исключение можно через throws
        Правильный ответ:
public static void test() throws IOException {
        throw new IOException();
        }
        → метод всегда выбрасывает IOException,
        try {
        FileWriter writer = new FileWriter("aaaa", true);
        }
        catch (NullPointerException e) {

        }
        → компилятор выдаст Unhandled exception: IOException,
public static void test() throws IOException {
        FileWriter writer = new FileWriter("aaaa", true);
        }
        → метод может выбросить IOException  */





    public static void main(String[] args) {
        Task10 labuda = new Task10();
        try {
            labuda.lineCount("123.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    Реализовать метод с сигнатурой private int lineCount(String filename) который возвращает количество строк
//    в файле filename. В случае ошибки пробросить исключение IOException со строкой сообщения "файл не найден"


    private int lineCount(String filename) throws IOException {
        int result = 0;
        try {
            FileReader f = new FileReader(filename);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String str = s.nextLine();
                result++;
            }
            s.close();
            f.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}