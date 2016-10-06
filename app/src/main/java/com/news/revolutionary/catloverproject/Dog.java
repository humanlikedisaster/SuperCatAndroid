package com.news.revolutionary.catloverproject;

/**
 * Created by ACIDxBOYx161 on 05.10.2016.
 */

public class Dog extends Pet {
    public int hungry;

    @Override
    public void goAway()
    {
        // Собака при любви меньше 50 должна убивать владельца.
        loveLevel -= 10;

        if (loveLevel < -50)
        {
            owner.kill();
        }
    }
}
