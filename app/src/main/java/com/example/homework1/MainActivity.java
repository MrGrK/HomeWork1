package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button xBt = findViewById(R.id.bt_add);
        Switch xSw = findViewById(R.id.sw_showCB);
        CheckBox xCb = findViewById(R.id.chB);
        ToggleButton xTgBt = findViewById(R.id.tgB);
        TextView xTV = findViewById(R.id.tv_res);
        xTV.setVisibility(View.INVISIBLE);
        xTV.setTextColor(Color.RED);
        xTV.setTextSize(15);
        xTV.setText("Absolute End");
        xSw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xSw.isChecked()){
                    xCb.setVisibility(View.VISIBLE);
                }else
                    xCb.setVisibility(View.INVISIBLE);
            }
        });


        xTgBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTgBt.isChecked())
                    xTV.setVisibility(View.VISIBLE);
                else
                    xTV.setVisibility(View.INVISIBLE);
            }
        });

        xBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSingInPage();
            }
        });
    }

    public void openSingInPage(){
        Intent xIntent = new Intent(this, SingInActivity2.class);
        startActivity(xIntent);
    }
}