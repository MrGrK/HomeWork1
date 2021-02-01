package com.example.homework1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SingInActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_user_data);

        EditText xEdtBDay = findViewById(R.id.Edt_bday);
        CalendarView xCvBDay = findViewById(R.id.cv_birthDayDate);

        xCvBDay.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                StringBuilder xBuilder = new StringBuilder();
                Integer xDay =dayOfMonth;
                Integer xMonth =month+1;
                String xMonthStr = xMonth.toString().length()>1? xMonth.toString():"0"+xMonth.toString();
                String xDayStr = xDay.toString().length()>1? xDay.toString():"0"+xDay.toString();
                xBuilder.append(xDayStr+"."+xMonthStr+"."+year);

                xEdtBDay.setText(xBuilder.toString());
                //for commit
            }
        });

    }
}