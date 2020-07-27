package ru.progwards.java1.lessons.io1;

import java.io.*;

public class CharFilter {
    static boolean contains(char a, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) return true;

        }
        return false;
    }

    public static void filterFile(String inFileName, String outFileName, String filter) throws IOException {    //throws IOexception
        FileReader fileInput = null;
        FileWriter fileOutput = null;
        try {
            fileInput = new FileReader(inFileName);
            fileOutput = new FileWriter(outFileName);

            char[] code = filter.toCharArray();
            try {
//                int ch = fileInput.read();                      //
//                while (ch != -1) {                              //
                for (int ch; (ch = fileInput.read()) != -1; ) {

                    char chr = (char) ch;
                    if (!contains(chr, code))
                        fileOutput.write(chr);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
//            finally {                       /**/
//                fileInput.close();
//                fileOutput.close();
//            }                               /**/
        } catch (IOException e) {
            throw e;
        } finally {
            try {
                fileInput.close();
            } catch (IOException e) {
            } finally {

                try {
                    fileOutput.close();
                } catch (IOException ioException) {
                }
            }
        }
    }


}


