package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {

    public static void main(String[] args) {

        Map<String, String> map = createPeopleList();

        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {

        //напишите тут ваш код
        Map<String, String> people = new HashMap<String, String>();

        people.put("Surname1","Name1");
        people.put("Surname2","Name2");
        people.put("Surname3","Name2");
        people.put("Surname4","Name4");
        people.put("Surname5","Name5");
        people.put("Surname6","Name6");
        people.put("Surname7","Name7");
        people.put("Surname8","Name8");
        people.put("Surname9","Name9");
        people.put("Surname1","Name10");

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {

        for (Map.Entry<String, String> s : map.entrySet()) {

            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}

