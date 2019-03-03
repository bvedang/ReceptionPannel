package com.example.vedan.receptionpannel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        ListView schedulelst = findViewById(R.id.scheduleList);
        ArrayList<String> patients = new ArrayList<String>();
        patients.add("Vedang");
        patients.add("Neeta");
        patients.add("Chandrakant");
        patients.add("Vijendra");
        patients.add("Devang");
        patients.add("Nikhil");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, patients);
        schedulelst.setAdapter(arrayAdapter);
    }
}
