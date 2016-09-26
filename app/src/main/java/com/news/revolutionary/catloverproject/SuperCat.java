package com.news.revolutionary.catloverproject;

/**
 * Created by hereiam on 25.09.16.
 */

public class SuperCat extends Cat {
    public int superpower;

    @Override
    public void goAway()
    {
        //Суперкот убивает хозяина только в случае, если любви больше нет, а суперсилы позволяют это сделать
        //В другом случае суперкот поступает точно также как и обычный кот.
        if (superpower > 5 && loveLevel < -100)
        {
           owner.kill();
        }
        else {
            super.goAway();
        }
    }
}
