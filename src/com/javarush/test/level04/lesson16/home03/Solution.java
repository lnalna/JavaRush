package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution {

    public static void main(String[] args)   throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean isMinusOne=false;
        int sum=0;
        String tempString;
        int tempNumber;

        while (!isMinusOne) {

            tempString = bufferedReader.readLine();
            tempNumber = Integer.parseInt(tempString);
            sum = sum + tempNumber;

            if(tempNumber == -1) {

                System.out.println(sum);
                break;
            }

        }
    }
}
