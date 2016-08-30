package com.example.asvolk13.day2b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if you need to do more view (UI) setup, do it here

        TextView tv = (TextView) findViewById(R.id.hello_view);

        // attach a click listener to the view

        // use an anonymous inner class

        tv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(MainActivity.this, R.string.Toast_text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
