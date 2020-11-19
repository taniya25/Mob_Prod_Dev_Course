package com.example.taniya.mob_prod_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button changeColorBtn, changeViewBtn, changeStringBtn;
    TextView text;
    EditText inputText;
    ConstraintLayout background;
    int num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeColorBtn = findViewById(R.id.changeColorBtn);
        text = findViewById(R.id.text);
        changeStringBtn = findViewById(R.id.changeStringBtn);
        changeViewBtn = findViewById(R.id.changeViewBtn);
        inputText = findViewById(R.id.inputText);
        background = findViewById(R.id.background);

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
                num++;
            }
        });

        changeViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num > 3)
                    num = 1;

                switch(num){
                    case 1: background.setBackgroundColor(getResources().getColor(R.color.peach));
                        break;
                    case 2: background.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;
                    case 3: background.setBackgroundColor(getResources().getColor(R.color.lilac));
                        break;
                }
                num++;
            }
        });

        changeStringBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(inputText.getText().toString());
            }
        });

    }
}