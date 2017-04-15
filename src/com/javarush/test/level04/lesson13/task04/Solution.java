package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int m = 10;
        int n = 10;

        for(int i=1; i<=m; i++) {

            for(int j=1;j<=n; j++) {
                if(i==1)
                    System.out.print(8);
            }

        }

        System.out.println();

        for(int i=1; i<=m; i++) {

            for(int j=1;j<=n; j++) {
                if(j==1)
                    System.out.print(8);
            }

            System.out.println();
        }
    }
}
