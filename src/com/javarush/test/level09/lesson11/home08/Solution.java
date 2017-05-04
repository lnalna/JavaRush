package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {

    public static void main(String[] args) {

        ArrayList<int[]> list = createList();
        printList(list);

    }

    public static ArrayList<int[]> createList() {

        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<int[]>();

        int[] array1 = new int[5];
        int[] array2 = new int[2];
        int[] array3 = new int[4];
        int[] array4 = new int[7];
        int[] array5 = new int[0];

        for(int i=0;i<array1.length;i++)
            array1[i] = 10+i;

        for(int i=0;i<array2.length;i++)
            array2[i] = 20+i;

        for(int i=0;i<array3.length;i++)
            array3[i] = 30+i;

        for(int i=0;i<array4.length;i++)
            array4[i] = 40+i;

        for(int i=0;i<array5.length;i++)
            array5[i] = 50+i;

        arrayList.add(array1);
        arrayList.add(array2);
        arrayList.add(array3);
        arrayList.add(array4);
        arrayList.add(array5);

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {

        for (int[] array: list ) {

            for (int x: array) {

                System.out.println(x);
            }
        }
    }
}
