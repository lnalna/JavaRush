package com.javarush.test.level03.lesson08.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
( Последовательность вводимых данных имеет большое значение.)

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!
 */
public class Solution
{
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(bufferedReader.readLine());
        String name = bufferedReader.readLine();

        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
