package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution {

    static int numberMax;
    static int numberMiddle;
    static int numberMin;

    public static void main(String[] args)   throws Exception {

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
            else {
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

            if (numberOne > numberTwo) {

                numberMiddle = numberOne;
                numberMin = numberTwo;
            }
            else {
                numberMiddle = numberTwo;
                numberMin = numberOne;
            }
        }

        System.out.println(numberMiddle);

    }
}
