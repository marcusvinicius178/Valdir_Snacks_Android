package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    String result;
    Button choice1;
    Button choice2;
    Button choice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.secondapp.R.layout.activity_main);

        result = "Cheese-Burger + Juice";
        choice1 = findViewById(com.example.secondapp.R.id.choice1);
        choice2 = findViewById(com.example.secondapp.R.id.choice2);
        choice3 = findViewById(com.example.secondapp.R.id.choice3);

        choice1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(choice1.getText().equals(result))
                    showToastMessage(true);
                else
                    showToastMessage(false);
            }
        });

        choice2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(choice2.getText().equals(result))
                    showToastMessage(true);
                else
                    showToastMessage(false);
            }
        });

        choice3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(choice3.getText().equals(result))
                    showToastMessage(true);
                else
                    showToastMessage(false);
            }
        });
    }

    private void showToastMessage(boolean showToastMessage)
    {
        if(showToastMessage)
            Toast.makeText(this, "Correct", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
    }
}