package com.example.quotegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    TextView tq;
    Button btnQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tq = findViewById(R.id.txtQuote);
        btnQ = findViewById(R.id.btnNext);
        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               displayQuote();
            }
        });
        displayQuote();
    }
    public void displayQuote(){
        int r = random.nextInt((5+1)-1)+1;
        String rq ="";
        switch(r){
            case 1:
                rq = getString(R.string.qoute1);
                break;
            case 2:
                rq = getString(R.string.qoute2);
                break;
            case 3:
                rq = getString(R.string.qoute3);
                break;
            case 4:
                rq = getString(R.string.qoute4);
                break;
            case 5:
                rq = getString(R.string.qoute5);
                break;

        }
        tq.setText(rq);
    }
}