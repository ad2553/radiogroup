package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity
{
    Switch sw;
    Button change;
    RadioButton whiterb,bluerb,redrb,greenrb;
    ConstraintLayout TL;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        change = findViewById(R.id.change);
        whiterb = findViewById(R.id.whiterb);
        bluerb = findViewById(R.id.bluerb);
        redrb = findViewById(R.id.redrb);
        greenrb = findViewById(R.id.greenrb);
        TL = findViewById(R.id.TL);

    }

    public void changeclicked(View view)
    {
        if(!sw.isChecked())
        {
            if(whiterb.isChecked()) TL.setBackgroundColor(Color.WHITE);
            if(bluerb.isChecked()) TL.setBackgroundColor(Color.BLUE);
            if(redrb.isChecked()) TL.setBackgroundColor(Color.RED);
            if(greenrb.isChecked()) TL.setBackgroundColor(Color.GREEN);
        }
    }

    public void whiteclicked(View view)
    {
        if(sw.isChecked())
        {
            TL.setBackgroundColor(Color.WHITE);
        }
    }

    public void blueclicked(View view)
    {
        if(sw.isChecked())
        {
            TL.setBackgroundColor(Color.BLUE);
        }
    }

    public void redclicked(View view)
    {
        if(sw.isChecked())
        {
            TL.setBackgroundColor(Color.RED);
        }
    }

    public void greenclicked(View view)
    {
        if(sw.isChecked())
        {
            TL.setBackgroundColor(Color.GREEN);
        }
    }
}