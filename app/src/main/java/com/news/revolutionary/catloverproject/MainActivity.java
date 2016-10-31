package com.news.revolutionary.catloverproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static Man thefirstMan;
    private static Man thesecondMan;
    private static Man thethirdMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat vaska = new Cat();
        Cat murzik = new SuperCat();
        Dog muchtar = new Dog();

        //Задайте параметры сами
        //Попробуйте сделать кота Ваську - принадлежащему второму человеку
        //Параметр возраста ни на что не влияет. Вы можете попробовать его убрать из инициализации
        //и написать создание человека заново.
        //Сделайте так, чтобы при попытке выкинуть кота - суперкот убивал второго хозяина, не меняя
        //реализацию классов Cat, SuperCat, Man
        thefirstMan = new Man(murzik, 21, "Имя первого человека");
        thesecondMan = new Man(vaska, 23, "Имя второго человека");
        thethirdMan = new Man(muchtar, 30, "Имя третьего человека");


        updateText();
    }

    public void updateText()
    {
        //Ищет нужный нам компонент, что отображает текст на экране.
        TextView textView = (TextView) findViewById(R.id.hello_world);
        //Задает необходимое значение
        textView.setText(thefirstMan.getInfo() + "\n" + thesecondMan.getInfo() + "\n" + thethirdMan.getInfo());
    }

    public void onGoAwayButtonClicked(View view)
    {
        thefirstMan.tryThrowOutPet();
        thesecondMan.tryThrowOutPet();
        thethirdMan.tryThrowOutPet();
        updateText();
    }
}
