package com.example.vedan.receptionpannel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PatientRegistration extends AppCompatActivity {

    EditText mobileno;

    public void registerHere(View view)
    {
        mobileno = (EditText) findViewById(R.id.mobileIDText);
        Toast.makeText(this, "Message sent to "+mobileno.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);
    }
}
