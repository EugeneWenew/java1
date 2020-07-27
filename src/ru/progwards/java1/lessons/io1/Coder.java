package ru.progwards.java1.lessons.io1;

import java.io.*;
import java.util.Scanner;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) throws Throwable{
//        try {
            try (FileReader fileReader = new FileReader(inFileName);
                 FileWriter fileWriter = new FileWriter(outFileName);
                 FileWriter logFile = new FileWriter(logName)) {
//            FileReader fileReader = new FileReader(inFileName);
//            FileWriter fileWriter = new FileWriter(outFileName);
//            FileWriter logFile = new FileWriter(logName);


//            try {
                int ch = fileReader.read();
                while (ch != -1) {
                    char newChar = code[ch];
                    System.out.println(ch + " " + newChar);
                    fileWriter.write(newChar);
                    ch = fileReader.read();
                }
//            } catch (IOException e) {
//                try {
//                    logFile.write(e.getMessage());
//                } catch (IOException e1) {

//                } finally {
//                    if (logFile != null)
//                        try {
//                            logFile.close();
//                        } catch (IOException e2) {
//                        }
//                }
//            } finally {
//                try {
//                    fileReader.close();
//                    fileWriter.close();
//                    logFile.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (IOException e) {
//            FileWriter logFile = null;
//
//            try {
//                logFile.write(e.getMessage());
//            } catch (IOException e1) {
//
//            } finally {
//                if (logFile != null)
//                    try {
//                        logFile.close();
//                    } catch (IOException e2) {
//                    }
//            }
//        }

            }
//        }
    }

    public static void main(String[] args) {
        try {
            codeFile("123.txt", "456.txt", "filter.txt", "log.txt");
        } catch (Throwable e) {
        }
    }
}
