package com.news.revolutionary.catloverproject;

/**
 * Created by hereiam on 25.09.16.
 */

public class Cat {
    public Man owner;
    public int ageLevel;
    public int loveLevel;

    public void goAway()
    {
        //Если выгоняем кота - у него уменьшается уровень любви к хозяину
        loveLevel -= 5;
    }
}
