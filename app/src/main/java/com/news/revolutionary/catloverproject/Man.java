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

    //Человек с котом
    public Man(Pet newPet, int newAge, String newName)
    {
        pet = newPet;
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
        String petString = "";

        if (pet != null) {
            if (pet instanceof SuperCat) {
                SuperCat superCat = (SuperCat) pet;
                petString = "У меня есть суперкот и его силы: " + superCat.superpower + "\n";
            }

            petString = "Кот любит меня на " + pet.loveLevel + "баллов любви\n" + petString;

            if (pet instanceof Dog) {
                Dog dog = (Dog)pet;
                petString = "У меня есть замечательный пес\nА его любовь ко мне: " + dog.loveLevel;
            }
        }

        //Вся информация, о классе и всех параметрах должна выводится на экран (метод getInfo класса Man)

        return "Привет, меня зовут "+ name +
                ", мне уже " + age + "!\n" +
                petString +
                (isDead ?  "Я мертв!" : "Я жив!"+"\n");

    }

}
