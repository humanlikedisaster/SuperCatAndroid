package com.news.revolutionary.catloverproject;

/**
 * Created by ACIDxBOYx161 on 05.10.2016.
 */

public class Dog {
    public int age;
    public int loveLevel;
    public Man owner;
    public void goAway()
    {
        loveLevel -= 10;
        if (loveLevel < -50)
        {
            owner.kill();
        }
    }
}
