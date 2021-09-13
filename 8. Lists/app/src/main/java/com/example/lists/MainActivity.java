package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView citiesList;
    private Spinner studentsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
      studentsSpinner = findViewById(R.id.studentsSpinner);
/*
        ArrayList<String> students = new ArrayList<>();
        students.add("Reb");
        students.add("Tom");
        students.add("Andreas");
        students.add("Peter");

        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item, students
        );

        studentsSpinner.setAdapter(studentsAdapter);
*/
        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, studentsSpinner.getSelectedItem().toString() + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        ArrayList<String> cities = new ArrayList<>();
        cities.add("Pecs");
        cities.add("Győr");
        cities.add("Veszprém");
        cities.add("BudaPest");
        cities.add("Eger");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, cities.get(i) + " selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}