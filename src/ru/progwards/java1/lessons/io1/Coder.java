package ru.progwards.java1.lessons.io1;

import java.io.*;
import java.util.Scanner;


// Создать статический метод public static void codeFile(String inFileName, String outFileName, char[] code, String logName),
// в котором прочитать файл inFileName и перекодировать его посимвольно в соответствии с заданным шифром, результат записать в outFileName.
// Шифр задается маcсивом char[] code, где каждому символу symbol оригинального файла соответствует символ code[(int)symbol] выходного файла.
// В случае ошибок, в файл с именем logName вывести название ошибки через метод класса Exception - getMessage()

//где finally {logFile.close() }
//где catch (IOexception e){
// sout (e.getMessage)
//   }
//кодирование


public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {
            FileInputStream byteFileRead = new FileInputStream(inFileName);
            FileOutputStream byteFileWrite = new FileOutputStream(outFileName);
            try {
                byte[] bytes = byteFileRead.readAllBytes();
                for (byte b = 0; b < bytes.length; b++) {
                    byteFileWrite.write(b);
                }
            } finally {
                try {
                    byteFileRead.close();
                } finally {
                    byteFileWrite.close();
                }
            }
        } catch (IOException e) {
            FileWriter logFile = null;

            try {
                logFile = new FileWriter(logName);
                logFile.write(e.getMessage());
            } catch (IOException e1) {
                if (logFile!= null)
                    try {
                        logFile.close();
                    }catch (IOException e2){};
            }
            e.printStackTrace();
        }
    }
}
