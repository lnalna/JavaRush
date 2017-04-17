package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle {

    //Напишите тут ваш код
    public int circleCenterX;
    public int circleCenterY;
    public int circleRadius;
    public int cirlceWidth;
    public int circleColor;

    public void initialize (int centerX, int centerY, int radius) {

        this.circleCenterX = centerX;
        this.circleCenterY = centerY;
        this.circleRadius = radius;
    }

    public void initialize (int centerX, int centerY, int radius, int wigth) {

        this.circleCenterX = centerX;
        this.circleCenterY = centerY;
        this.circleRadius = radius;
        this.cirlceWidth = wigth;
    }

    public void initialize (int centerX, int centerY, int radius, int wigth, int color) {

        this.circleCenterX = centerX;
        this.circleCenterY = centerY;
        this.circleRadius = radius;
        this.cirlceWidth = wigth;
        this.circleColor = color;
    }

}
