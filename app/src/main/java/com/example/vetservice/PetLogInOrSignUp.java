package com.example.vetservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PetLogInOrSignUp extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_loginor_signup);
    }
    public void onClick(View view){
        Button petsignupButton = (Button) findViewById(R.id.ownersignup);

        petsignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PetLogInOrSignUp.this, PetSignUp.class));
            }
        });


        Button petloginButton = (Button) findViewById(R.id.OwnerLogin);

        petloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PetLogInOrSignUp.this, OwnerLogin.class));
            }
        });

    }
}