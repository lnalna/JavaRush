package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width,
height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)

Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {

    //Напишите тут ваш код
    public int rectangleTop;
    public int rectangleLeft;
    public int rectangleWidth;
    public int rectangleHeight;

    public void initialize (int top, int left, int width, int height) {

        this.rectangleTop = top;
        this.rectangleLeft = left;
        this.rectangleWidth = width;
        this.rectangleHeight = height;
    }

    public void initialize (int top, int left) {

        this.rectangleTop = top;
        this.rectangleLeft = left;
    }

    public void initialize (int top, int left, int width) {

        this.rectangleTop = top;
        this.rectangleLeft = left;
        this.rectangleWidth = width;
    }

    public void initialize (Rectangle anotherRectangle) {

        this.rectangleTop = anotherRectangle.rectangleTop;
        this.rectangleLeft = anotherRectangle.rectangleLeft;
        this.rectangleWidth = anotherRectangle.rectangleWidth;
        this.rectangleHeight = anotherRectangle.rectangleHeight;
    }

}
