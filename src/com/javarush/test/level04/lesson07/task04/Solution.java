package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество
отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberOne = Integer.parseInt(bufferedReader.readLine());
        int numberTwo = Integer.parseInt(bufferedReader.readLine());
        int numberThree = Integer.parseInt(bufferedReader.readLine());

        int numberPositive = 0;
        int numberNegative = 0;

        if (numberOne > 0)
            numberPositive++;

        if (numberOne < 0)
            numberNegative++;

        if (numberTwo > 0)
            numberPositive++;

        if (numberTwo < 0)
            numberNegative++;

        if (numberThree > 0)
            numberPositive++;

        if (numberThree < 0)
            numberNegative++;

        System.out.println("количество отрицательных чисел: "+numberNegative);
        System.out.println("количество положительных чисел: "+numberPositive);

    }
}
