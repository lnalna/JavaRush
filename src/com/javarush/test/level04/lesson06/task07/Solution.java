package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberOne = Integer.parseInt(bufferedReader.readLine());
        int orderOne = 1;

        int numberTwo = Integer.parseInt(bufferedReader.readLine());
        int orderTwo = 2;

        int numberThree = Integer.parseInt(bufferedReader.readLine());
        int orderThree = 3;

        if ((numberOne != numberTwo) && (numberOne != numberThree) && (numberTwo == numberThree))
            System.out.println(orderOne);

        if ((numberTwo != numberOne) && (numberTwo != numberThree) && (numberOne == numberThree))
            System.out.println(orderTwo);

        if ((numberThree != numberOne) && (numberThree != numberTwo) && (numberOne == numberTwo))
            System.out.println(orderThree);

    }
}
