package com.android.wordgame.ui.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.wordgame.R;

public class startActivity extends AppCompatActivity {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Intent intent=getIntent();
        setName(intent.getStringExtra("name"));
        final Button startButton=findViewById(R.id.startButon);
        final Button lastGameButton=findViewById(R.id.lastGameButon);
        final Button highScoreButton=findViewById(R.id.scoreButton);
        final Button exitButton=findViewById(R.id.exitButton);
        final TextView nameView=findViewById(R.id.nameView);
        nameView.setText(getName());
    }

    public void clickStartBtn(View view) {
            Intent intent=new Intent(getApplicationContext(),gameActivity.class);
            intent.putExtra("name",getName());
            startActivity(intent);
    }

    public void clickLastGameBtn(View view) {
        Intent intent=new Intent(getApplicationContext(),gameActivity.class);
        startActivity(intent);
    }

    public void clickHighScoreBtn(View view) {
        Intent intent=new Intent(getApplicationContext(),scoreActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }
    public void clickExitBtn(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(startActivity.this);
        builder.setTitle("❌ Exit");
        builder.setMessage("Do you want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(startActivity.this,"See you!",Toast.LENGTH_LONG).show();
                finish(); //Uygulamayi kapat
                }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(startActivity.this,"Let's play game",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog=builder.create(); //Alert diyologu olusturma metodu
        dialog.show(); //Alert dialogu ekrana basar
    }

}
