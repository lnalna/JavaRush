package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен,
то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {

    //Напишите тут ваш код
    public String catName = null;
    public int catWeight;
    public int catAge;
    public int catColor;
    public String catAdress = null;

    public void initialize (String name) {

        this.catName = name;
    }

    public void initialize (String name, int weight, int age) {

        this.catName = name;
        this.catWeight = weight;
        this.catAge = age;
    }

    public void initialize (String name, int age) {

        this.catName = name;
        this.catAge = age;
    }

    public void initialize (int weight, int color) {

        this.catWeight = weight;
        this.catColor = color;
    }

    public void initialize (int weight, int color, String adress) {

        this.catWeight = weight;
        this.catColor = color;
        this.catAdress = adress;
    }

}
