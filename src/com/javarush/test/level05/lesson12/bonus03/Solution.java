package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum  ;

        //1. вводит с консоли число N > 0
        int N = Integer.parseInt(reader.readLine());

        if(N>0) {


            int[] a = new int[N];
//2. потом вводит N чисел с консоли
            for (int i = 0; i < N; i++)
                a[i] = Integer.parseInt(reader.readLine());


            for (int i = 0; i < N; i++)
                for (int j = 0; j < N - 1; j++) {

                    if (a[j + 1] > a[j]) {

                        int temp = a[j + 1];
                        a[j + 1] = a[j];
                        a[j] = temp;
                    }

                }

            maximum = a[0];
            //напишите тут ваш код

//3. выводит на экран максимальное из введенных N чисел
            System.out.println(maximum);
        }
    }
}
