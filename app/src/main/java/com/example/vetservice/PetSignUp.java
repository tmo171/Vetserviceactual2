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

    ArrayList<String> arrayList_dog,arrayList_cat,arrayList_horses,arrayList_hamsters,arrayList_birds,arrayList_rabbits;
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
        arrayList_parent.add("horses");
        arrayList_parent.add("hamsters");
        arrayList_parent.add("birds");
        arrayList_parent.add("rabbits");


        arrayAdapter_parent= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_parent);

        typeofpetspinner.setAdapter(arrayAdapter_parent);

        arrayList_dog=new ArrayList<>();
        arrayList_dog.add("Beagle");
        arrayList_dog.add("Border Collie");
        arrayList_dog.add("Border terrier");
        arrayList_dog.add("Cockapoo");
        arrayList_dog.add("Cocker Spaniel");
        arrayList_dog.add("English Setter");
        arrayList_dog.add("German Shepherd");
        arrayList_dog.add("Gordon Setter");
        arrayList_dog.add("Irish Setter");
        arrayList_dog.add("Jack Russell");
        arrayList_dog.add("Labrador");
        arrayList_dog.add("Springer Spaniel");
        arrayList_dog.add("Lurcher");
        arrayList_dog.add("West Highland White Terrier");







        arrayList_cat=new ArrayList<>();
        arrayList_cat.add("Bengal");
        arrayList_cat.add("British Shorthair");
        arrayList_cat.add("Maine Coon");
        arrayList_cat.add("Persian");
        arrayList_cat.add("Ragdoll");
        arrayList_cat.add("Russian Blue");
        arrayList_cat.add("Savannah");
        arrayList_cat.add("Scottish Fold");
        arrayList_cat.add("Siamese");
        arrayList_cat.add("Sphynx");

        arrayList_horses=new ArrayList<>();
        arrayList_horses.add("Andalusian");
        arrayList_horses.add("American Quarter Horse");
        arrayList_horses.add("Appaloosa");
        arrayList_horses.add("Arabian");
        arrayList_horses.add("Paint");
        arrayList_horses.add("Pony");
        arrayList_horses.add("Morgan");
        arrayList_horses.add("Thoroughbred");
        arrayList_horses.add("Tennessee Walker");


        arrayList_hamsters=new ArrayList<>();
        arrayList_hamsters.add("Chinese");
        arrayList_hamsters.add("Dwarf Campbell Russian");
        arrayList_hamsters.add("Dwarf Winter White Russian");
        arrayList_hamsters.add("Roborovski Dwarf");
        arrayList_hamsters.add("Syrian");



        arrayList_birds=new ArrayList<>();
        arrayList_birds.add("African Gray Parrot");
        arrayList_birds.add("Budgie");
        arrayList_birds.add("Cockatiel");
        arrayList_birds.add("Dove");
        arrayList_birds.add("Finch");
        arrayList_birds.add("Lovebird");
        arrayList_birds.add("Parakeet");
        arrayList_birds.add("Parrotlet");


        arrayList_rabbits= new ArrayList<>();
        arrayList_rabbits.add("Dutch Lop");
        arrayList_rabbits.add("Dwarf Hotot");
        arrayList_rabbits.add("Holland Lop");
        arrayList_rabbits.add("Mini Lop");
        arrayList_rabbits.add("Mini Rex");
        arrayList_rabbits.add("Mini Satin");
        arrayList_rabbits.add("Netherland Dwarf");
        arrayList_rabbits.add("Polish");


        typeofpetspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0)
                {
                    arrayAdapter_child=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_dog);
                }
                if(i==1)
                {
                    arrayAdapter_child=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_cat);
                }
                if(i==2)
                {
                    arrayAdapter_child=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_horses);
                }
                if(i==3)
                {
                    arrayAdapter_child=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_hamsters);
                }

                if(i==4)
                {
                    arrayAdapter_child=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_birds);
                }

                if(i==5)
                {
                    arrayAdapter_child=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_rabbits);
                }

                breedofpetspinner.setAdapter(arrayAdapter_child);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
