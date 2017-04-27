package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandFather1 = new Human("GrandFather1",true,70,false);
        Human grandFather2 = new Human("GrandFather2",true,68,false);
        Human grandMother1 = new Human("GrandMother1",false,68,false);
        Human grandMother2 = new Human("GrandMother2",false,66,false);
        Human father = new Human("Father1",true,45,false);
        Human mother = new Human("Mother",false,43,false);
        Human child1 = new Human("Child1",true,20,true);
        Human child2 = new Human("Child2",true,18,true);
        Human child3 = new Human("Child3",false,16,true);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age,boolean childFlag)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;

            if(childFlag)
                children.add(this);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;
/*
                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
*/
            }

            return text;
        }
    }

}
