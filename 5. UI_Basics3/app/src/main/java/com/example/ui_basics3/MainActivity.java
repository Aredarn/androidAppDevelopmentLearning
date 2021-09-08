package com.example.ui_basics3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkboxHarry, checkboxMatric, checkboxJoker;
    private RadioGroup rgMaritalStatus;
    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxHarry = findViewById(R.id.chechboxHarry);
        checkboxMatric = findViewById(R.id.chechboxMatrix);
        checkboxJoker = findViewById(R.id.chechboxJoker);

        rgMaritalStatus = findViewById(R.id.rgMaritalStatus);

        progressBar = findViewById(R.id.progressbar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(800);}
            }
        });
        thread.start();


        int checkedbutton = rgMaritalStatus.getCheckedRadioButtonId();

        switch (checkedbutton){
            case R.id.rbMarried:
                Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle:
                Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbInRel:
                Toast.makeText(MainActivity.this, "In a Relationship", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId){
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbInRel:
                        Toast.makeText(MainActivity.this, "In a Relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });


        if(checkboxHarry.isChecked()){
            Toast.makeText(MainActivity.this, "You have watched Harry Potter", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
        }


        checkboxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "You have watched Harry Potter", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}