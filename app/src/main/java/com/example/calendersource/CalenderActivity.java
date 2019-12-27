package com.example.calendersource;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalenderActivity extends AppCompatActivity
{
    private static final String TAG="CalnderActivity";
    private CalendarView mCalenderView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender_layout);
        mCalenderView=(CalendarView)findViewById(R.id.calendarView);
        mCalenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
        {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2)
            {
                String date= (i1+1) + "/" + (i2) + "/" + i;
                Log.d(TAG, "OnSelectedDayChange : dd/mm/yyyy : "+ date);
                Intent intent = new Intent(CalenderActivity.this, MainActivity.class);
                intent.putExtra("date",date);
                startActivity(intent);
            }

        });
    }
}

