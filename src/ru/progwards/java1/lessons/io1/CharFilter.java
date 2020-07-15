package ru.progwards.java1.lessons.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharFilter {
    public static void filterFile(String inFileName, String outFileName, String filter) {
        try {
            FileInputStream FileInput = new FileInputStream(inFileName);
            FileOutputStream FileOutput = new FileOutputStream(outFileName);
            char[] charCode = filter.toCharArray();
            try {
                byte[] bytes = FileInput.readAllBytes();
                for (int b = 0; b < bytes.length; b++) {
                    for (int i = 0; i < charCode.length; i++) {
                        if (bytes[b] == charCode[b]) {
                            System.arraycopy(bytes, b + 1, bytes, b, bytes.length - b);
                            FileOutput.write(i);
                        }
                    }
                }
            } finally {
                try {
                    FileInput.close();
                } finally {
                    FileOutput.close();
                }
            }
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        String str = new String("123.txt");
        String str2 = new String("456.txt");
        String filter = new String("456.txt");

        System.out.println(filterFile(str,str2,filter));
    }


}

