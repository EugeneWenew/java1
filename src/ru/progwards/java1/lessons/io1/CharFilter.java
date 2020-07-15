package ru.progwards.java1.lessons.io1;

import java.io.*;

public class CharFilter {
    public static void filterFile(String inFileName, String outFileName, String filter) {    //throws IOexception
        FileReader fileInput = null;
        FileWriter fileOutput = null;
        try {
             fileInput = new FileReader(inFileName);
             fileOutput = new FileWriter(outFileName);
            char[] charCode = filter.toCharArray();
            try {
                byte[] bytes = fileInput.read();
                for (int b = 0; b < bytes.length; b++) {
                    for (int i = 0; i < charCode.length; i++) {
                        if (bytes[b] == charCode[b]) {
                            System.arraycopy(bytes, b + 1, bytes, b, bytes.length - b);
                            fileOutput.write(i);
                        }
                    }
                }
            } finally {
                try {
                    fileInput.close();
                } finally {
                    fileOutput.close();
                }
            }
        } finally {
            if fileInput !=

        }
    }
//
//    public static void main(String[] args) {
//        String str = new String("123.txt");
//        String str2 = new String("456.txt");
//        String filter = new String("456.txt");
//
//        System.out.println(filterFile(str,str2,filter));
//    }


}

