package com.example.benja.ftcroverruckusscorer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NewMatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_match);
    }

    public void Alliance_Color(View view){
        Switch AllianceColor = (Switch)findViewById(R.id.AllianceColorSwitch);
        TextView Points = (TextView)findViewById(R.id.Points);

        if (AllianceColor.isChecked()) {
            Points.setBackgroundColor(Color.RED);
        }
        else{
            Points.setBackgroundColor(Color.BLUE);
        }
    }
}
