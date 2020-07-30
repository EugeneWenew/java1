package ru.progwards.java1.lessons.io1;

import java.io.*;
import java.util.Scanner;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try (
                FileWriter logFile = new FileWriter(logName)) {
            try (FileReader fileReader = new FileReader(inFileName);
                 FileWriter fileWriter = new FileWriter(outFileName)) {
                int ch = fileReader.read();
                while (ch != -1) {
                    char newChar = code[ch];
                    System.out.println(ch + " " + newChar);
                    fileWriter.write(newChar);
                    ch = fileReader.read();
                }
            } catch (Throwable e) {
                logFile.write(e.getMessage());
            }
        } catch (Throwable e2) {
        }
    }
}
