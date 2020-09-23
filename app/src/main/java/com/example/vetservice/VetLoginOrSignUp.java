package com.example.vetservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VetLoginOrSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vet_login_or_sign_up);
    }
    public void onClick(View view){
        Button vetsignupButton = (Button) findViewById(R.id.ownersignup);

        vetsignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vetLoginorSignup.this, petsignup.class));
            }
        });


        Button vetloginButton = (Button) findViewById(R.id.OwnerLogin);

        vetloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(vetLoginorSignup.this, ownerlogin.class));
            }
        });

    }
}