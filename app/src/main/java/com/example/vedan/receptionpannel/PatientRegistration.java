package com.example.vedan.receptionpannel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;


public class PatientRegistration extends AppCompatActivity {

    public EditText mobileno;
    public EditText name;

    public void registerHere(View view)
    {
        mobileno = findViewById(R.id.mobileIDText);
        name = findViewById(R.id.nameText);
        Toast.makeText(this, "Message sent to "+mobileno.getText().toString(), Toast.LENGTH_SHORT).show();
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Patient").child(mobileno.getText().toString());
        Map<String, Object> updates = new HashMap<String,Object>();
        updates.put("Name", name.getText().toString());
        updates.put("Otp", "1");
        databaseReference.updateChildren(updates);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);
    }
}
