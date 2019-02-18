package com.example.vedan.receptionpannel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userid,password;
    public void loginFunction(View view)
    {
        userid = (EditText)findViewById(R.id.userIDText);
        password = (EditText)findViewById(R.id.passwordText);
        if((userid.getText().toString().equals("vedang"))&& (password.getText().toString().equals("barhate")))
        {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
            Intent secondactivity = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(secondactivity);
        }
        else
        {
            Toast.makeText(this, "The details you have Entered are incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
