package com.example.firstchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        TextView firstNameLabel = findViewById(R.id.firstNameLabel);
        TextView lastNameLabel = findViewById(R.id.lastNameLabel);
        TextView emailAddress = findViewById(R.id.emailLabel);

        EditText firstNameTXT = findViewById(R.id.firstNameTXT);
        EditText lastNameTXT = findViewById(R.id.lastNameTXT);
        EditText emailTXT = findViewById(R.id.emailTXT);

        firstNameLabel.setText("First name: " + firstNameTXT.getText().toString());
        lastNameLabel.setText("Last name: " + lastNameTXT.getText().toString());
        emailAddress.setText("Email address: " + emailTXT.getText().toString());
    }
}