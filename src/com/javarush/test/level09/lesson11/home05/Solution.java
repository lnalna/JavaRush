package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String string = bufferedReader.readLine();

        char[] stringToChar = string.toCharArray();

        for(char temp:stringToChar) {

            if (isVowel(temp))
                sb1.append(temp+" ");

            else if (32 != (byte)temp)   // 32- код символа "пробел"
                sb2.append(temp+" ");
        }

        System.out.println(sb1.toString());
        System.out.println(sb2.toString());

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {

        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        //ищем среди массива гласных
        for (char d : vowels) {

            if (c == d)
                return true;
        }

        return false;
    }
}
