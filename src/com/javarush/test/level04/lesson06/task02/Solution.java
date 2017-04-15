package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberOne = Integer.parseInt(bufferedReader.readLine());
        int numberTwo = Integer.parseInt(bufferedReader.readLine());
        int numberThree = Integer.parseInt(bufferedReader.readLine());
        int numberFour = Integer.parseInt(bufferedReader.readLine());

        int maxFisrt = max(numberOne,numberTwo);
        int maxSecond = max(numberThree,numberFour);

        System.out.println(max(maxFisrt,maxSecond));

    }

    public static int max(int a,int b) {

        int maximum;

        if (a > b)
            maximum = a;
        else
            maximum = b;

        return maximum;
    }
}
