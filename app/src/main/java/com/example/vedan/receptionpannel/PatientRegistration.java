package com.example.vedan.receptionpannel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class PatientRegistration extends AppCompatActivity {

    public EditText mobileno;
    public EditText name;
    private DatabaseReference databaseReference;

    public void registerHere(View view)
    {
        mobileno = findViewById(R.id.mobileIDText);
        name = findViewById(R.id.nameText);
        Toast.makeText(this, "Message sent to "+mobileno.getText().toString(), Toast.LENGTH_SHORT).show();
        databaseReference.child("Patient").push().child(name.getText().toString()).child(mobileno.getText().toString()).setValue("1");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);
        databaseReference = FirebaseDatabase.getInstance().getReference();
}
}
