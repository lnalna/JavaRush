package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {

    //напишите тут ваш код
    String dogName;
    int dogHeight;
    String dogColor;

    public Dog(String name) {

        this.dogName = name;
    }

    public Dog(String name,int height) {

        this.dogName = name;
        this.dogHeight = height;
    }

    public Dog(String name,int height, String color) {

        this.dogName = name;
        this.dogHeight = height;
        this.dogColor = color;
    }
}
