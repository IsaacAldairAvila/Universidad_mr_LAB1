package com.example.mr_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btll, bttl, btrl, btcl, btfl, btal, bte1, bte2, bte3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btll = (Button) findViewById(R.id.btLinearLayout);
        btll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(intent);
            }
        });
        bttl = (Button) findViewById(R.id.btTableLayout);
        bttl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TableLayoutLab.class);
                startActivity(intent);
            }
        });
        btrl = (Button) findViewById(R.id.btRelativeLayout);
        btrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeLayoutLab.class);
                startActivity(intent);
            }
        });
        btcl = (Button) findViewById(R.id.btConstraintLayout);
        btcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConstraintLayoutLab.class);
                startActivity(intent);
            }
        });
        btfl = (Button) findViewById(R.id.btFrameLayout);
        btfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameLayoutLab.class);
                startActivity(intent);
            }
        });
        btal = (Button) findViewById(R.id.btAbsoluteLayout);
        btal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AbsoluteLayoutLab.class);
                startActivity(intent);
            }
        });
        bte1 = (Button) findViewById(R.id.bte1);
        bte1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EJERCICIO1.class);
                startActivity(intent);
            }
        });
        bte2 = (Button) findViewById(R.id.bte2);
        bte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EJERCICIO2.class);
                startActivity(intent);
            }
        });
        bte3 = (Button) findViewById(R.id.bte3);
        bte3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EJERCICIO3.class);
                startActivity(intent);
            }
        });
    }
}