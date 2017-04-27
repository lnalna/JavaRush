package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {

    public static HashMap<String, Date> createMap() {

        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("FEBRUARY 23 1970"));
        map.put("Stallone3", new Date("MARCH 1 1990"));
        map.put("Stallone4", new Date("APRIL 2 1991"));
        map.put("Stallone5", new Date("MAY 3 1992"));
        map.put("Stallone6", new Date("JUNE 2 1981"));
        map.put("Stallone7", new Date("JUNE 5 1982"));
        map.put("Stallone8", new Date("APRIL 2 1972"));
        map.put("Stallone9", new Date("FEBRUARY 2 1984"));
        map.put("Stallone10", new Date("MARCH 1 1995"));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Date> pair = iterator.next();
            Date fullDate = pair.getValue();

            if(fullDate.getMonth() == 5 || fullDate.getMonth() == 6 || fullDate.getMonth() ==7)
                iterator.remove();
        }

    }

    public static void main(String[] args) {

        HashMap<String, Date> map = new HashMap<String, Date>();

        map = createMap();

        System.out.println("Первоначальный список:");
        for(Map.Entry<String,Date> pair :map.entrySet())
            System.out.println(pair.getKey()+" "+pair.getValue());

        removeAllSummerPeople(map);

        System.out.println();
        System.out.println("Список, после удаления:");

        for(Map.Entry<String,Date> pair :map.entrySet())
            System.out.println(pair.getKey()+" "+pair.getValue());

    }
}
