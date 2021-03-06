package com.example.vetservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button vetButton = (Button) findViewById(R.id.DecideVet);

        vetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VetLoginOrSignUp.class));
            }
        });


        Button petButton = (Button) findViewById(R.id.DecidePet);

        petButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PetLogInOrSignUp.class));
            }
        });

    }


    public void onClick(android.view.View view) {
    }
}
