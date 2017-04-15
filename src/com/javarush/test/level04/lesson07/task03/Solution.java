package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberOne = Integer.parseInt(bufferedReader.readLine());
        int numberTwo = Integer.parseInt(bufferedReader.readLine());
        int numberThree = Integer.parseInt(bufferedReader.readLine());

        int numberPositive=0;

        if (numberOne > 0)
            numberPositive++;

        if (numberTwo > 0)
            numberPositive++;

        if (numberThree > 0)
            numberPositive++;

        System.out.println(numberPositive);
    }
}
