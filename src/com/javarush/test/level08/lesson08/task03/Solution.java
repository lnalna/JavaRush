package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {

    public static HashMap<String,String> createMap() {

        //напишите тут ваш код
        HashMap<String,String> hashMap = new HashMap<String,String>();

        String testName="Name";
        String testSurname="Surname";

        for (int i=0;i<10;i++) {

            testName+=" " +i;
            testSurname+=" " +i;

            hashMap.put(testSurname,testName);
        }

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String,String> map, String name) {
        //напишите тут ваш код
        int getCount=0;


        for(Map.Entry<String,String> pair:map.entrySet()) {

            if (pair.getValue().equals(name))
                getCount++;
        }

        return getCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        //напишите тут ваш код
        int getCount=0;


        for(Map.Entry<String,String> pair:map.entrySet()) {

            if (pair.getKey().equals(lastName))
                getCount++;
        }

        return getCount;

    }

    public static void main(String[] args) {

        String testName="Name 0";
        String testSurname="Surname 0";

        System.out.println(Solution.getCountTheSameFirstName(Solution.createMap(), testName));
        System.out.println(Solution.getCountTheSameLastName(Solution.createMap(), testSurname));
    }

}
