package com.news.revolutionary.catloverproject;

/**
 * Created by hereiam on 25.09.16.
 */

public class Man {
    public Pet pet;
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

    //Человек с питомцем
    public Man(Pet newpet, int newAge, String newName)
    {
        pet = newpet;
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
        String textString = "";


        if (pet != null) {


            if (pet instanceof Cat) {
                textString = "Возраст кота: " + pet.ageLevel + "\n";
                if (pet instanceof SuperCat) {

                    SuperCat superCat = (SuperCat) pet;
                    textString = "У меня есть суперкот и его силы: " + superCat.superpower + "\n" + textString;
                }
                textString = "Кот любит меня на " + pet.loveLevel + "баллов любви\n" + textString;
            }

            if (pet instanceof Dog) {
                textString = "Возраст собаки: " + pet.ageLevel + "\n";
                textString = "Собака любит меня на:  " + pet.loveLevel + "баллов любви\n" + textString;
            }

        }

        return "Привет, меня зовут "+ name + ", мне уже " + age + "!\n" +
                textString +
                (isDead ?  "Я мертв!" : "Я жив!"+"\n");
    }
}
