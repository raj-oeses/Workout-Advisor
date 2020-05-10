package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Back extends AppCompatActivity implements View.OnClickListener {
    String typeis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daysandtype);
        Button day1=(Button)findViewById(R.id.day1);
        Button day2=(Button)findViewById(R.id.day2);


        day1.setOnClickListener(this);
        day2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Spinner types=(Spinner)findViewById(R.id.type);
        typeis=String.valueOf(types.getSelectedItem());




        switch (v.getId()){
            case R.id.day1:if(typeis.equals("Select The Type"))
                Toast.makeText(getApplicationContext(),"Select The Type", Toast.LENGTH_SHORT).show();
            else if(typeis.equals("Beginner"))
                setContentView(R.layout.beginnerday1back);
            else if(typeis.equals("Intermediate"))
                setContentView(R.layout.intermediateday1back);
            else if(typeis.equals("Advance"))
                setContentView(R.layout.advanceday1back);
                break;


            case R.id.day2:if(typeis.equals("Select The Type"))
                Toast.makeText(getApplicationContext(),"Select The Type", Toast.LENGTH_SHORT).show();
            else if(typeis.equals("Beginner"))
                setContentView(R.layout.beginnerday2back);
            else if(typeis.equals("Intermediate"))
                setContentView(R.layout.intermediateday2back);
            else if(typeis.equals("Advance"))
                setContentView(R.layout.advanceday2back);
                break;

        }

    }
}
