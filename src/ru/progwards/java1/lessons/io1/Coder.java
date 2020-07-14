package ru.progwards.java1.lessons.io1;

import java.io.*;
import java.util.Scanner;
// Создать статический метод public static void codeFile(String inFileName, String outFileName, char[] code, String logName),
// в котором прочитать файл inFileName и перекодировать его посимвольно в соответствии с заданным шифром, результат записать в outFileName.
// Шифр задается маcсивом char[] code, где каждому символу symbol оригинального файла соответствует символ code[(int)symbol] выходного файла.
// В случае ошибок, в файл с именем logName вывести название ошибки через метод класса Exception - getMessage()





public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {

//            FileReader reader = new FileReader(inFileName);
//            Scanner scanner = new Scanner(reader);
            FileInputStream byteFileRead = new FileInputStream(inFileName);
            FileOutputStream byteFileWrite = new FileOutputStream(outFileName);

            try {
                FileWriter logFile = new FileWriter(logName);
                logFile.write(/*new Exception getMessage */);
                byte[] bytes = byteFileRead.readAllBytes();

                try {
                    for (byte b = 0; b < bytes.length; b++) {

                        //где finally {logFile.close() }

                        //где catch (IOexception e){
                        // sout (e.getMessage)
                        //   }


                        //кодирование



                        byteFileWrite.write(b);



                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
