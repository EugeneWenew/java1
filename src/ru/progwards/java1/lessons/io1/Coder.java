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


public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {
            FileReader fileReader = new FileReader(inFileName);
            FileWriter fileWriter = new FileWriter(outFileName);
            try {
                int ch = fileReader.read();
                while (ch != -1) {       //код "0" ?
                    char newChar = code[ch];
//                                    //каретка 13

                        System.out.println(ch + " " + newChar);
                        ch = fileReader.read();
                        fileWriter.write(ch);
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
                if (logFile != null)
                    try {
                        logFile.close();
                    } catch (IOException e2) {
                    }
            }
        }
    }

    public static void main(String[] args) {
        char[] mass = new char[100];
        for (int i = 0; i < mass.length - 1; i++) {
            mass[i] = (char) i;
        }
        String code = "hsbvjskbkjvbbvlwbnbn;brnaiowrhgawrbvwajrnihgaiurghaowirlnbjaiwgoefj ezirgaowiugvbzlfdislgiwahaurgvbiqwertyuiop";
//        System.out.println(mass);
        String str = new String("123.txt");
        String str2 = new String("456.txt");
        String str3 = new String("log.txt");
        codeFile(str, "456.txt", code.toCharArray(), str3);
    }
}
