package com.example.benja.ftcroverruckusscorer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        final ListView lv = findViewById(R.id.listViewScores);

        ArrayList<String> Teams = new ArrayList<String>(0);
        Teams.add(GV.numTeams - 2, GV.Team1);
        Teams.add(GV.numTeams - 1, GV.Team2);
    }
}