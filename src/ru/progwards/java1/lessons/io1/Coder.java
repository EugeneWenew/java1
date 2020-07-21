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
//byte[] bytes   {[q] [w] [e] [r] [t] [y] [u]}
//char[] code    {[1] [2] [3] [4] [5] [6] [7]}
//outFileName    "                           "
//                                    //каретка 13

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {
            FileReader fileReader = new FileReader(inFileName);
            FileWriter fileWriter = new FileWriter(outFileName);
            try {
                int ch = fileReader.read();
                while (ch != -1) {
                    char newChar = code[ch];
                    System.out.println(ch + " " + newChar);
                    fileWriter.write(newChar);
                    ch = fileReader.read();
                }
            } finally {
                fileReader.close();
                fileWriter.close();


            }
        } catch (IOException e) {
            FileWriter logFile = null;

            try {
                logFile = new FileWriter(logName);
                logFile.write(e.getMessage());
            } catch (IOException e1) {

            } finally {
                if (logFile != null)
                    try {
                        logFile.close();
                    } catch (IOException e2) {
                    }
            }
        }
    }


}
