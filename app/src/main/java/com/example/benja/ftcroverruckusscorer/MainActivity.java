package com.example.benja.ftcroverruckusscorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNewMatch(View view){
        Intent startNewMatchActivity = new Intent(this, NewMatch.class);
        startActivity(startNewMatchActivity);
    }

    public void openScores(View view){
        Intent startScoresActivity = new Intent(this, Scores.class);
        startActivity(startScoresActivity);
    }
}
