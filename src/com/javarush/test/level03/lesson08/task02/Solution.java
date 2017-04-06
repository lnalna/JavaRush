package com.javarush.test.level03.lesson08.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.

Пример:
Коля получает 3000 через 5 лет.
 */
public class Solution
{
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            String name = bufferedReader.readLine();
            int number1 = Integer.parseInt(bufferedReader.readLine());
            int number2 = Integer.parseInt(bufferedReader.readLine());


        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");

    }

}
