package com.javarush.test.level03.lesson08.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    * *Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!

 Пример:
 Тимур зарабатывает $5,000. Ха-ха-ха!
 */
public class Solution
{
    public static String name ;

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            name = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
