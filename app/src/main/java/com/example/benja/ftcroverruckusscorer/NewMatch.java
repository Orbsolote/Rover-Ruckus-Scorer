package com.example.benja.ftcroverruckusscorer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class NewMatch extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    int PointsValue = 0;
    int RL = 0;
    int RS = 0;
    int TM = 0;
    int RPC = 0;
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
        CheckBox RL1 = findViewById(R.id.RL1);
        CheckBox RL2 = findViewById(R.id.RL2);
        CheckBox RS1 = findViewById(R.id.RS1);
        CheckBox RS2 = findViewById(R.id.RS2);
        CheckBox TM1 = findViewById(R.id.TM1);
        CheckBox TM2 = findViewById(R.id.TM2);
        CheckBox RPC1 = findViewById(R.id.RPC1);
        CheckBox RPC2 = findViewById(R.id.RPC2);
        EditText MininDepot1 = findViewById(R.id.MininDepot1);
        EditText MininDepot2 = findViewById(R.id.MininDepot2);
        EditText MininCargo1 = findViewById(R.id.MininCargo1);
        EditText MininCargo2 = findViewById(R.id.MininCargo2);
        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);

        AllianceColor.setOnClickListener(this);
        Team1.setOnClickListener(this);
        Team2.setOnClickListener(this);
        RL1.setOnClickListener(this);
        RL2.setOnClickListener(this);
        RS1.setOnClickListener(this);
        RS2.setOnClickListener(this);
        TM1.setOnClickListener(this);
        TM2.setOnClickListener(this);
        RPC1.setOnClickListener(this);
        RPC2.setOnClickListener(this);
        MininDepot1.setOnClickListener(this);
        MininDepot2.setOnClickListener(this);
        MininCargo1.setOnClickListener(this);
        MininCargo2.setOnClickListener(this);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView Points = findViewById(R.id.Points);
        Switch AllianceColor = findViewById(R.id.AllianceColorSwitch);
        CheckBox RL1 = findViewById(R.id.RL1);
        CheckBox RL2 = findViewById(R.id.RL2);
        CheckBox RS1 = findViewById(R.id.RS1);
        CheckBox RS2 = findViewById(R.id.RS2);
        CheckBox TM1 = findViewById(R.id.TM1);
        CheckBox TM2 = findViewById(R.id.TM2);
        CheckBox RPC1 = findViewById(R.id.RPC1);
        CheckBox RPC2 = findViewById(R.id.RPC2);
        EditText MininDepot1 = findViewById(R.id.MininDepot1);
        EditText MininDepot2 = findViewById(R.id.MininDepot2);
        EditText MininCargo1 = findViewById(R.id.MininCargo1);
        EditText MininCargo2 = findViewById(R.id.MininCargo2);
        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);

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
                if (RL1.isChecked()) {
                    RL += 30;
                } else {
                    RL -= 30;
                }
                break;
            case R.id.RL2:
                if (RL2.isChecked()) {
                    RL += 30;
                } else {
                    RL -= 30;
                }
                break;
            case R.id.RS1:
                if (RS1.isChecked()) {
                    RS += 25;
                } else {
                    RS -= 25;
                }
                break;
            case R.id.RS2:
                if (RS2.isChecked()) {
                    RS += 25;
                } else {
                    RS -= 25;
                }
                break;
            case R.id.TM1:
                if (TM1.isChecked()) {
                    TM += 15;
                } else {
                    TM -= 15;
                }
                break;
            case R.id.TM2:
                if (TM2.isChecked()) {
                    TM += 15;
                } else {
                    TM -= 15;
                }
                break;
            case R.id.RPC1:
                if (RPC1.isChecked()) {
                    RPC += 10;
                } else {
                    RPC -= 10;
                }
                break;
            case R.id.RPC2:
                if (RPC2.isChecked()) {
                    RPC += 10;
                } else {
                    RPC -= 10;
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
        }
        PointsValue = (RL + RS + TM + RPC + MiD1 + MiD2 + MiC1 + MiC2 + Spin1 + Spin2);
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
        PointsValue = (RL + RS + TM + RPC + MiD1 + MiD2 + MiC1 + MiC2 + Spin1 + Spin2);
        Points.setText(Integer.toString(PointsValue));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}