package ru.progwards.java1.lessons.io1;

import java.io.*;

public class CharFilter {
    public static void filterFile(String inFileName, String outFileName, String filter) {    //throws IOexception
        FileReader fileInput = null;
        FileWriter fileOutput = null;
        try {
            fileInput = new FileReader(inFileName);
            fileOutput = new FileWriter(outFileName);
            char[] code = filter.toCharArray();
            try {
                
                int ch = fileInput.read();
                for (int i = 0; i < code.length; i++) {                     //  contains ??
                    if (inFileName.contains(String.valueOf(code[i])) != true) {            //System.arraycopy(inFileName,i+1,inFileName,i,inFileName.length()-i);                  //  fileInput ??     (filter)             //to String ??

                        fileOutput.write(inFileName);                                   //.write или arraycopy
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInput.close();
                } finally {
                    fileOutput.close();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        int ch = 97;
        char chr = (char) ch;
//        System.out.println(ch);
//        System.out.println(chr);
        String code = "a3";
        filterFile("123.txt", "456.txt", code);

    }
}


