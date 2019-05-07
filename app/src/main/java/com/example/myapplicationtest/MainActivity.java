package com.example.myapplicationtest;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    Button b1;
    Button b2;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv1.setTextColor(Color.rgb(255,0,0));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv1.setTextColor(Color.rgb(0,255,0));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv1.setTextColor(Color.rgb(0,0,255));
            }
        });
    }

}
