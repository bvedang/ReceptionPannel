package com.example.vedan.receptionpannel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public void registrationFunction(View view)
    {
        Intent newpatient = new Intent(SecondActivity.this,PatientRegistration.class);
        startActivity(newpatient);
    }

    public void scheduleFunction(View view)
    {
        Intent schedule = new Intent(SecondActivity.this,Schedule.class);
        startActivity(schedule);
    }

    public void currentPatientFunction(View view)
    {
        Intent currentPateint = new Intent(this,CurrentPatient.class);
        startActivity(currentPateint);
    }

    public void paymentFunction(View view)
    {
        Intent payment = new Intent(this,Payment.class);
        startActivity(payment);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
