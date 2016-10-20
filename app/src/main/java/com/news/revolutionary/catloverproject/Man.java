package com.news.revolutionary.catloverproject;

/**
 * Created by hereiam on 25.09.16.
 */

public class Man {
    public Cat pet;
    public int age;
    public int intellect;
    public String name;
    public boolean isDead;

    //Человек без кота
    public Man(int newAge, String newName)
    {
        age = newAge;
        name = newName;
        isDead = false;
    }

    //Человек с котом
    public Man(Cat cat, int newAge, String newName)
    {
        pet = cat;
        pet.owner = this;
        age = newAge;
        name = newName;
        isDead = false;
    }

    //Пробует послать кота гулять
    public void tryThrowOutPet()
    {
        if (pet != null)
        {
            pet.goAway();
        }
    }

    //Смерть
    public void kill()
    {
        isDead = true;
        pet = null;
        age = -1;
    }

    public String getInfo()
    {
        String сatString = "";

        if (pet != null) {
            if (pet instanceof SuperCat) {
                SuperCat superCat = (SuperCat) pet;
                сatString = "У меня есть суперкот и его силы: " + superCat.superpower + "\n";
            }
            сatString = "Кот любит меня на " + pet.loveLevel + " баллов любви\n" + сatString;
        }

        return "Привет, меня зовут "+ name +
                ", мне уже " + age + "!\n" +
                сatString +
                (isDead ?  "Я мертв!" : "Я жив!"+"\n");
    }
}
