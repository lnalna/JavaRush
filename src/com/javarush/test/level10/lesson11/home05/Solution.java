package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution {

    public static void main(String[] args)  throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();


        //Переносим алфавит в ArrayList
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {

            alphabet.add(abcArray[i]);
        }

        //создаем список строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {

            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //Создаем карту для подсчета. В ней будут храниться <"Буква","Число повторений">
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<33;i++)
            map.put(alphabet.get(i),0);


/*
Внешний цикл по списку строк
Берем строку, переводим ее в массив символов и в переменну temp сохраняем поочереди каждый симвом массива.
Ищем в map ключ, равный символу в переменной temp, когда находим, увеличиваем значений в map на единицу,
и сохраняем его в map.
 */

        for(int i=0;i<list.size();i++) {

            for(char temp:list.get(i).toCharArray()) {


                for (Map.Entry<Character,Integer > s : map.entrySet()) {

                    if(s.getKey().equals(temp)) {

                        int tempInt=0;
                        tempInt=s.getValue();
                        tempInt++;
                        map.put(s.getKey(),tempInt);
                    }
                }

            }
        }



/*
Чтобы вывести только символы алфавита, проверяем равенство с ключами map-а
 */
        for(int i=0;i<33;i++) {

            for (Map.Entry<Character,Integer > s : map.entrySet()) {

                if(s.getKey().equals(alphabet.get(i))) {

                    System.out.println(s.getKey()+" "+s.getValue());
                    break;
                }
            }
        }
    }

}


