package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        //напишите тут ваш код
        int[] numbers = new int[20];

        for(int i=0;i<20;i++)
            numbers[i]=Integer.parseInt(reader.readLine());

        maximum=numbers[0];
        minimum=numbers[0];

        for(int i=1;i<20;i++) {

            if(numbers[i]>maximum)
                maximum=numbers[i];

            if(numbers[i]<minimum)
                minimum=numbers[i];
        }


        System.out.print(maximum);
        System.out.print(" ");
        System.out.print(minimum);
    }
}
