public class Task10 {
    public Integer sqr(Integer n) {
        try {
            return n * n;
        }
        catch (NullPointerException e){
            return -1;
        }
    }

    public static void main(String[] args) {
        Task10 labuda = new Task10();
        System.out.println(labuda.sqr(4));
    }
}

//    Правильные ответы: Исключение - проблемы возникающие при выполнении кода, Исключения освобождают код от передачи информации о возникшей проблеме, Все исключения в Java описываются классами
