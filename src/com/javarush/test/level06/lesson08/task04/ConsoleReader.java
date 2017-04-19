package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую
переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader {

    public static String readString() throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        return bufferedReader.readLine();
    }

    public static int readInt() throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bufferedReader.readLine());
    }

    public static double readDouble() throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(bufferedReader.readLine());
    }

    public static boolean readBoolean() throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(bufferedReader.readLine());
    }

    public static void main(String[] args) {

        String tempString;
        int tempInt;
        double tempDouble;
        boolean tempBoolean;


        try {
              tempString = readString();
              tempInt = readInt();
              tempDouble = readDouble();
              tempBoolean = readBoolean();

              System.out.println("tempString = "+tempString);
              System.out.println("tempInt = "+tempInt);
              System.out.println("tempDouble = "+tempDouble);
              System.out.println("tempBoolean = "+tempBoolean);

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
