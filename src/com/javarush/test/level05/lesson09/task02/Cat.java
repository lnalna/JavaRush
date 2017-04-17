package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat {

    //напишите тут ваш код
    String catName = null;
    String catStandartName = null;

    String catAddress = null;
    String catStandartAddress = null;

    int catWeight;
    int catStandartWeight = 1;

    int catAge;
    int catStandartAge = 2;

    String catColor;
    String catStandartColor = "Grey";



    public Cat(String name) {

        this.catName = name;
    }

    public Cat(String name,int weight,int age) {

        this.catName = name;
        this.catWeight = weight;
        this.catAge = age;
    }

    public Cat(String name,int age) {

        this.catName = name;
        this.catAge = age;
        this.catWeight = catStandartWeight;
    }

    public Cat(int weight,String color) {

        this.catWeight = weight;
        this.catColor = color;
        this.catName = catStandartName;
        this.catAddress = catStandartAddress;
        this.catAge = catStandartAge;

    }

    public Cat(int weight, String color, String address) {

        this.catWeight = weight;
        this.catColor = color;
        this.catAddress = address;
    }

}
