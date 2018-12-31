package com.example.benja.ftcroverruckusscorer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class NewMatch extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    int PointsValue = 0;
    int RL1 = 0;
    int RL2 = 0;
    int RS1 = 0;
    int RS2 = 0;
    int TM1 = 0;
    int TM2 = 0;
    int RPC1 = 0;
    int RPC2 = 0;
    int MiD1 = 0;
    int MiD2 = 0;
    int MiC1 = 0;
    int MiC2 = 0;
    int Spin1 = 0;
    int Spin2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_match);

        Switch AllianceColor = findViewById(R.id.AllianceColorSwitch);
        EditText Team1 = findViewById(R.id.Team1);
        EditText Team2 = findViewById(R.id.Team2);
        CheckBox RobotLanded1 = findViewById(R.id.RL1);
        CheckBox RobotLanded2 = findViewById(R.id.RL2);
        CheckBox RobotSampled1 = findViewById(R.id.RS1);
        CheckBox RobotSampled2 = findViewById(R.id.RS2);
        CheckBox TeamMarker1 = findViewById(R.id.TM1);
        CheckBox TeamMarker2 = findViewById(R.id.TM2);
        CheckBox RobotParkedCrater1 = findViewById(R.id.RPC1);
        CheckBox RobotParkedCrater2 = findViewById(R.id.RPC2);
        EditText MininDepot1 = findViewById(R.id.MininDepot1);
        EditText MininDepot2 = findViewById(R.id.MininDepot2);
        EditText MininCargo1 = findViewById(R.id.MininCargo1);
        EditText MininCargo2 = findViewById(R.id.MininCargo2);
        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);
        Button FinishedButton = findViewById(R.id.FinishedButton);

        AllianceColor.setOnClickListener(this);
        Team1.setOnClickListener(this);
        Team2.setOnClickListener(this);
        RobotLanded1.setOnClickListener(this);
        RobotLanded2.setOnClickListener(this);
        RobotSampled1.setOnClickListener(this);
        RobotSampled2.setOnClickListener(this);
        TeamMarker1.setOnClickListener(this);
        TeamMarker2.setOnClickListener(this);
        RobotParkedCrater1.setOnClickListener(this);
        RobotParkedCrater2.setOnClickListener(this);
        MininDepot1.setOnClickListener(this);
        MininDepot2.setOnClickListener(this);
        MininCargo1.setOnClickListener(this);
        MininCargo2.setOnClickListener(this);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        FinishedButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        TextView Points = findViewById(R.id.Points);
        Switch AllianceColor = findViewById(R.id.AllianceColorSwitch);
        CheckBox RobotLanded1 = findViewById(R.id.RL1);
        CheckBox RobotLanded2 = findViewById(R.id.RL2);
        CheckBox RobotSampled1 = findViewById(R.id.RS1);
        CheckBox RobotSampled2 = findViewById(R.id.RS2);
        CheckBox TeamMarker1 = findViewById(R.id.TM1);
        CheckBox TeamMarker2 = findViewById(R.id.TM2);
        CheckBox RobotParkedCrater1 = findViewById(R.id.RPC1);
        CheckBox RobotParkedCrater2 = findViewById(R.id.RPC2);
        EditText MininDepot1 = findViewById(R.id.MininDepot1);
        EditText MininDepot2 = findViewById(R.id.MininDepot2);
        EditText MininCargo1 = findViewById(R.id.MininCargo1);
        EditText MininCargo2 = findViewById(R.id.MininCargo2);

        switch (v.getId()) {
            case R.id.AllianceColorSwitch:
                if (AllianceColor.isChecked()) {
                    Points.setBackgroundColor(Color.RED);
                } else {
                    Points.setBackgroundColor(Color.BLUE);
                }
                break;

            case R.id.Team1:
                break;

            case R.id.Team2:
                break;

            case R.id.RL1:
                if (RobotLanded1.isChecked()) {
                    RL1 += 30;
                } else {
                    RL1 -= 30;
                }
                break;

            case R.id.RL2:
                if (RobotLanded2.isChecked()) {
                    RL2 += 30;
                } else {
                    RL2 -= 30;
                }
                break;

            case R.id.RS1:
                if (RobotSampled1.isChecked()) {
                    RS1 += 25;
                } else {
                    RS1 -= 25;
                }
                break;

            case R.id.RS2:
                if (RobotSampled2.isChecked()) {
                    RS2 += 25;
                } else {
                    RS2 -= 25;
                }
                break;

            case R.id.TM1:
                if (TeamMarker1.isChecked()) {
                    TM1 += 15;
                } else {
                    TM1 -= 15;
                }
                break;

            case R.id.TM2:
                if (TeamMarker2.isChecked()) {
                    TM2 += 15;
                } else {
                    TM2 -= 15;
                }
                break;

            case R.id.RPC1:
                if (RobotParkedCrater1.isChecked()) {
                    RPC1 += 10;
                } else {
                    RPC1 -= 10;
                }
                break;

            case R.id.RPC2:
                if (RobotParkedCrater2.isChecked()) {
                    RPC2 += 10;
                } else {
                    RPC2 -= 10;
                }
                break;

            case R.id.MininDepot1:
                MiD1 = (Integer.parseInt(MininDepot1.getText().toString()) * 2);
                break;

            case R.id.MininDepot2:
                MiD2 = (Integer.parseInt(MininDepot2.getText().toString()) * 2);
                break;

            case R.id.MininCargo1:
                MiC1 = (Integer.parseInt(MininCargo1.getText().toString()) * 5);
                break;

            case R.id.MininCargo2:
                MiC2 = (Integer.parseInt(MininCargo2.getText().toString()) * 5);
                break;
            case R.id.FinishedButton:
                sendScores();
        }
        PointsValue = (RL1 + RL2 + RS1 + RS2 + TM1 + TM2 + RPC1 +
                RPC2 + MiD1 + MiD2 + MiC1 + MiC2 + Spin1 + Spin2);
        Points.setText(Integer.toString(PointsValue));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.spinner1) {
            switch (position) {
                case 0:
                    Spin1 = 0;
                    break;
                case 1:
                    Spin1 = 50;
                    break;
                case 2:
                    Spin1 = 25;
                    break;
                case 3:
                    Spin1 = 10;
                    break;
            }
        } else if (parent.getId() == R.id.spinner2) {
            switch (position) {
                case 0:
                    Spin2 = 0;
                    break;
                case 1:
                    Spin2 = 50;
                    break;
                case 2:
                    Spin2 = 25;
                    break;
                case 3:
                    Spin2 = 10;
                    break;
            }
        }
        TextView Points = findViewById(R.id.Points);
        PointsValue = (RL1 + RL2 + RS1 + RS2 + TM1 + TM2 + RPC1 +
                RPC2 + MiD1 + MiD2 + MiC1 + MiC2 + Spin1 + Spin2);
        Points.setText(Integer.toString(PointsValue));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void sendScores(){

        EditText Team1 = findViewById(R.id.Team1);
        EditText Team2 = findViewById(R.id.Team2);

        Intent sendscores_intent = new Intent("com.example.benja.ftcroverruckusscorer.Scores");
        sendscores_intent.putExtra("Team 1", Team1.toString());
        sendscores_intent.putExtra("Team 2", Team2.toString());
        sendscores_intent.putExtra("Robot Landed1", RL1);
        sendscores_intent.putExtra("Robot Landed2", RL2);
        sendscores_intent.putExtra("Robot Sampled1", RS1);
        sendscores_intent.putExtra("Robot Sampled2", RS2);
        sendscores_intent.putExtra("Team Marker Claimed1", TM1);
        sendscores_intent.putExtra("Team Marker Claimed2", TM2);
        sendscores_intent.putExtra("Robot Parked1", RPC1);
        sendscores_intent.putExtra("Robot Parked2", RPC2);
        sendscores_intent.putExtra("MineralsDepot1", MiD1);
        sendscores_intent.putExtra("MineralsDepot2", MiD2);
        sendscores_intent.putExtra("MineralsCargo1", MiC1);
        sendscores_intent.putExtra("MineralsCargo2", MiC2);
        sendscores_intent.putExtra("End_Game_Pos1", Spin1);
        sendscores_intent.putExtra("End_Game_Pos2", Spin2);

        startActivity(sendscores_intent);

        GV.Team1 = Team1.toString();
        GV.Team2 = Team2.toString();
        GV.numTeams += 2;
    }
}