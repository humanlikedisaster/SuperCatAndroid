package com.news.revolutionary.catloverproject;

/**
 * Created by hereiam on 25.09.16.
 */

public class Cat {
    public Man owner;
    public int loveLevel;
    public int ageLevel;

    public void goAway()
    {
        //Если выгоняем кота - у него уменьшается уровень любви к хозяину
        loveLevel -=5;

        //Если выгоняют кота - у него увеличивается возраст
        ageLevel += 5;
    }
}