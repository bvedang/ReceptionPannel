package com.example.vedan.receptionpannel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PatientRegistration extends AppCompatActivity {

    public EditText mobileno;
    private DatabaseReference databaseReference;

    public void registerHere(View view)
    {
        mobileno = findViewById(R.id.mobileIDText);
        Toast.makeText(this, "Message sent to "+mobileno.getText().toString(), Toast.LENGTH_SHORT).show();
        databaseReference.child("Mobile no:-").setValue(mobileno.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);
        databaseReference = FirebaseDatabase.getInstance().getReference();
}
}
