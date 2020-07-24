package com.android.wordgame.ui.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import com.android.wordgame.R;
import android.os.Bundle;
import android.widget.TextView;

public class scoreActivity extends AppCompatActivity {

    String[] names;
    TextView name1,time1,score1,name2,time2,score2,name3,time3,score3;
    static String name;
    float totalTime;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("name1",name);
        super.onSaveInstanceState(outState);
    }

    public void settings(){
        name1=findViewById(R.id.name1);
        time1=findViewById(R.id.time1);
        score1=findViewById(R.id.score1);
        name2=findViewById(R.id.name2);
        time2=findViewById(R.id.time2);
        score2=findViewById(R.id.score2);
        name3=findViewById(R.id.name3);
        time3=findViewById(R.id.time3);
        score3=findViewById(R.id.score3);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scorescreen);

        settings();

        Intent gameIntent=getIntent();

       gameIntent.getFloatExtra("totalTime",totalTime);
       score1.setText(gameIntent.getStringExtra("score"));
       time1.setText(gameIntent.getStringExtra("totalTime"));
       name1.setText(gameIntent.getStringExtra("name"));

        score2.setText(gameIntent.getStringExtra("score2"));
        time2.setText(gameIntent.getStringExtra("totalTime2"));
        name2.setText(gameIntent.getStringExtra("name2"));

        score3.setText(gameIntent.getStringExtra("score3"));
        time3.setText(gameIntent.getStringExtra("totalTime3"));
        name3.setText(gameIntent.getStringExtra("name3"));
    }
}
