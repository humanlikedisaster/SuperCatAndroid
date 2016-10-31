package com.news.revolutionary.catloverproject;

/**
 * Created by Галя on 27.10.2016.
 */

public class Dog extends Pet{

    @Override
    public void kill()
    {
        //Если уровень любви меньше 50 - убивает хозяина
        owner.kill();

    }
    @Override
    public void goAway()
    {
        loveLevel -= 2;
        //Собкак убивает хозяина только в случае, если любви меньше 50
        if (loveLevel < -50)
        {
            owner.kill();
        }
        else {
            super.goAway();
            loveLevel -= 5;
        }
    }
}



