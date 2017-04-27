package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {

    public static HashMap<String, String> createMap() {

        //напишите тут ваш код
        HashMap<String,String> hashMap = new HashMap<String, String>();

        hashMap.put("Surname1","Name1");
        hashMap.put("Surname2","Name2");
        hashMap.put("Surname3","Name3");
        hashMap.put("Surname4","Name4");
        hashMap.put("Surname5","Name5");
        hashMap.put("Surname6","Name6");
        hashMap.put("Surname7","Name7");
        hashMap.put("Surname8","Name8");
        hashMap.put("Surname9","Name1");
        hashMap.put("Surname10","Name1");

        return hashMap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for(Map.Entry<String, String> element : copy.entrySet()) {

            int count = 0;
            for (Map.Entry<String, String> copyElement : copy.entrySet()) {

                if (element.getValue().equals(copyElement.getValue()))
                    count++;
            }
            if (count > 1)
                removeItemFromMapByValue(map, element.getValue());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {

        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair: copy.entrySet()) {

            if (pair.getValue().equals(value))
                map.remove(pair.getKey());

        }
    }

//for Debug

    public static void main(String[] args){

        HashMap<String,String> map = new HashMap<String, String>();

        map = createMap();

        System.out.println("До удаления:");
        for(Map.Entry<String,String> pair :map.entrySet())
            System.out.println(pair.getKey()+" "+pair.getValue());


        removeTheFirstNameDuplicates(map);

        System.out.println();
        System.out.println("После удаления:");
        for(Map.Entry<String,String> pair :map.entrySet())
            System.out.println(pair.getKey()+" "+pair.getValue());


    }

}

