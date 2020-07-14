package ru.progwards.java1.lessons.io1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {

    public static int calcEmpty(String fileName) {       //метод опасный throws IOException
        int result = 0;
        try {
            FileReader reader = new FileReader(fileName);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if (str.equals("")) result++;
            }
            scanner.close();
            reader.close();
        } catch (Throwable e) {
            return -1;
        }

        return result;
    }


}
