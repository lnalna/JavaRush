package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        int[] numbers = new int[10];
        int[] reverseNumbers = new int[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++)
            numbers[i] = Integer.parseInt(bufferedReader.readLine());


        for (int i=0; i<10; i++)
            reverseNumbers[i] = numbers[9-i];

        for (int i=0; i<10; i++)
            numbers[i] = reverseNumbers[i];

        for (int i=0; i<10; i++)
            System.out.println(numbers[i]);
    }
}
