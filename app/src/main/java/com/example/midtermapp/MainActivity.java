package com.example.midtermapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tvName;
    TextView tvResults;
    Button btnPush;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = (EditText) findViewById(R.id.txtName);
        tvResults = (TextView) findViewById(R.id.txtResults);
        btnPush = (Button) findViewById(R.id.btnPush);


    }
    public void buttonPushClick (View view) {

        tvResults.setText(tvName.getText().toString() + " " + "is a great Android programmer!");



    }
}
