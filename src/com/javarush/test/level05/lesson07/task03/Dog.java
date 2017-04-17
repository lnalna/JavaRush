package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {

    //Напишите тут ваш код
    public String dogName = null;
    public int dogHeight;
    public int dogColor;

    public void initialize (String name) {

        this.dogName = name;
    }

    public void initialize (String name, int height) {

        this.dogName = name;
        this.dogHeight = height;
    }

    public void initialize (String name, int height, int color) {

        this.dogName = name;
        this.dogHeight = height;
        this.dogColor = color;
    }
}
