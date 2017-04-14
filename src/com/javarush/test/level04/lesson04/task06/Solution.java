package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int weekDay = Integer.parseInt(bufferedReader.readLine());

        if(weekDay==1)
            System.out.println("понедельник");

        if(weekDay==2)
            System.out.println("вторник");

        if(weekDay==3)
            System.out.println("среда");

        if(weekDay==4)
            System.out.println("четверг");

        if(weekDay==5)
            System.out.println("пятница");

        if(weekDay==6)
            System.out.println("суббота");

        if(weekDay==7)
            System.out.println("воскресенье");

        if((weekDay<1)||(weekDay>7))
            System.out.println("такого дня недели не существует");

    }

}