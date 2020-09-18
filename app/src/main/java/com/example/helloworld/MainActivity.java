package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button b;
     EditText E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.hButton);
        E=(EditText) findViewById(R.id.personName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String s=E.getText().toString();
                TextView vv=(TextView)findViewById(R.id.textView);
                vv.setText("Hello "+s);
            }
        });
    }
}