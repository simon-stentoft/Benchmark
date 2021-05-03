package com.example.benchmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ordModtager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ordModtager = (EditText) findViewById(R.id.ordModtager);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendOrd();
            }
        });
    }

    public void sendOrd() {
        Intent intent = new Intent(this, Backwards.class);
        String besked = ordModtager.getText().toString();
        startActivity(intent);
    }
}