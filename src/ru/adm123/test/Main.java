package ru.adm123.test;

import java.io.*;

/**
 * @author Dmitry Ushakov on 19.03.21
 */
public class Main {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(new File("input.txt"));
             FileWriter fw = new FileWriter(new File("output.txt"))) {
            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = fr.read()) != -1) {
                sb.append((char) c);
            }
            String[] digits = sb.toString().trim().split("\\s+", 2);
            fw.write(String.valueOf(Integer.parseInt(digits[0]) + Integer.parseInt(digits[1])));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
