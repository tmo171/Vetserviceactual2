package com.example.vetservice;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PetSignUp extends AppCompatActivity {

    Spinner typeofpetspinner, breedofpetspinner;

    ArrayList<String> arrayList_parent;
    ArrayAdapter<String> arrayAdapter_parent;

    ArrayList<String> arrayList_dog,arrayList_cat;
    ArrayAdapter<String> arrayAdapter_child;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petsignup);

        typeofpetspinner=(Spinner)findViewById(R.id.typeofpetspinner);
        breedofpetspinner=(Spinner)findViewById(R.id.breedofpetspinner);

        arrayList_parent=new ArrayList<>();
        arrayList_parent.add("dog");
        arrayList_parent.add("cat");

        arrayAdapter_parent= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_parent);

        typeofpetspinner.setAdapter(arrayAdapter_parent);

        arrayList_dog=new ArrayList<>();
        arrayList_dog.add("Beagle");

        arrayList_cat=new ArrayList<>();
        arrayList_cat.add("tabby");

        typeofpetspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(position==0)
                {
                    arrayAdapter_child=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_dog);
                }
                if(position==1)
                {
                    arrayAdapter_child=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_cat);
                }

                breedofpetspinner.setAdapter(arrayAdapter_child);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
