package com.example.calendersource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG= "MainActivity";
 private TextView thedate;
 private Button btncal;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         thedate =(TextView)findViewById(R.id.tvdate);
         btncal=(Button)findViewById(R.id.buttonCal);
         Intent incomingintent = getIntent();
         String tvdate =incomingintent.getStringExtra("data");
         thedate.setText(tvdate);
         btncal.setOnClickListener(new View.OnClickListener()

         {
             @Override
             public void onClick(View view)
             {
                 Intent intent= new Intent(MainActivity.this, CalenderActivity.class);
                 startActivity(intent);
             }
        }
        );
    }
}
