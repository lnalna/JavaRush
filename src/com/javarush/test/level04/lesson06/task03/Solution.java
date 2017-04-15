package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution {

    static int numberMax;
    static int numberMiddle;
    static int numberMin;

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberOne = Integer.parseInt(bufferedReader.readLine());
        int numberTwo = Integer.parseInt(bufferedReader.readLine());
        int numberThree = Integer.parseInt(bufferedReader.readLine());



        if((numberOne > numberTwo) && (numberOne > numberThree)) {

            numberMax = numberOne;

            if (numberTwo > numberThree) {

                numberMiddle = numberTwo;
                numberMin = numberThree;
            }
            else{
                numberMiddle = numberThree;
                numberMin = numberTwo;
            }


        }

        if((numberTwo > numberOne) && (numberTwo > numberThree)) {

            numberMax = numberTwo;

            if(numberOne > numberThree){

                numberMiddle = numberOne;
                numberMin = numberThree;
            }
            else {
                numberMiddle = numberThree;
                numberMin = numberOne;
            }
        }

        if((numberThree > numberOne) && (numberThree > numberTwo)) {

            numberMax = numberThree;

            if (numberOne > numberTwo){

                numberMiddle = numberOne;
                numberMin = numberTwo;
            }
            else{
                numberMiddle = numberTwo;
                numberMin = numberOne;
            }
        }
        System.out.println(numberMax);
        System.out.println(numberMiddle);
        System.out.println(numberMin);
    }
}
