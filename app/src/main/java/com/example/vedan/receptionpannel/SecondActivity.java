package com.example.vedan.receptionpannel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public void registrationFunction(View view)
    {
        Intent newpatient = new Intent(SecondActivity.this,PateintRegistration.class);
        startActivity(newpatient);
    }

    public void scheduleFunction(View view)
    {


    }

    public void currentPatientFunction(View view)
    {

    }

    public void paymentFunction(View view)
    {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
