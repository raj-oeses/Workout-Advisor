package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Legs legss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Chest(View view) {
        Intent chest= new Intent(this, Chest.class);
        startActivity(chest);
    }
    public void Legs(View view){
        Intent legs=new Intent(this, Legss.class);
        startActivity(legs);
    }
    public void Back(View view){
        Intent back=new Intent(this, Back.class);
        startActivity(back);
    }

    public void Biceps(View view){
        Intent biceps=new Intent(this,Biceps.class);
        startActivity(biceps);
    }
}
