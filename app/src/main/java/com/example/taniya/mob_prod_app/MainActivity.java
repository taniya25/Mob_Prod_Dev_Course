package com.example.taniya.mob_prod_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button changeColorBtn;
    TextView text;
    int num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeColorBtn = findViewById(R.id.changeColorBtn);
        text = findViewById(R.id.text);

        changeColorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num > 3)
                    num = 1;

                switch(num){
                    case 1: text.setTextColor(getResources().getColor(R.color.red));
                    break;
                    case 2: text.setTextColor(getResources().getColor(R.color.green));
                    break;
                    case 3: text.setTextColor(getResources().getColor(R.color.purple));
                    break;
                }

            }
        });

    }
}