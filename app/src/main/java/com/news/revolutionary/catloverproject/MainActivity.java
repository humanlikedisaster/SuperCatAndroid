package com.news.revolutionary.catloverproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static Man firstMan;
    private static Man secondMan;
	private static Man badstudent;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		Cat badcat = new SuperCat();
		
        //Задайте параметры сами
        //Попробуйте сделать кота Ваську - принадлежащему второму человеку
        //Параметр возраста ни на что не влияет. Вы можете попробовать его убрать из инициализации
        //и написать создание человека заново.
        //Сделайте так, чтобы при попытке выкинуть кота - суперкот убивал второго хозяина, не меняя
        //реализацию классов Cat, SuperCat, Man

		badstudent = new Man(badcat, 20, "badstudent");
        updateText();
		
		
    }

    public void updateText()
    {
        //Ищет нужный нам компонент, что отображает текст на экране.
        TextView textView = (TextView) findViewById(R.id.hello_world);
        //Задает необходимое значение
        textView.setText(badstudent.getInfo());
    }

    public void onGoAwayButtonClicked(View view)
    {
        badstudent.tryThrowOutPet();
        badstudent.isDead = true;
        updateText();
    }
}
