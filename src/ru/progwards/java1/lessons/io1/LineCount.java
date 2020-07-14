package ru.progwards.java1.lessons.io1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {

    public static int calcEmpty(String fileName) throws IOException {
        int result = 0;
        try {
            FileReader f = new FileReader(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String str = s.nextLine();
                if (str.equals("")) result++;
            }
            s.close();
            f.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("-1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


}
