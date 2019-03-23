package com.example.vedan.receptionpannel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

public class Pharmacist extends AppCompatActivity {
    TextView textViewMed1,textViewMed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacist);
        textViewMed1 = findViewById(R.id.textView10);
        textViewMed2 = findViewById(R.id.textView13);
        Button btnscanqr = findViewById(R.id.scanButton);
        final IntentIntegrator qrscan = new IntentIntegrator(this);
        btnscanqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qrscan.initiateScan();
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Result Not Found", Toast.LENGTH_LONG).show();
            } else {
                try {
                    JSONObject obj = new JSONObject(result.getContents());
                    textViewMed1.setText(obj.getString("name"));
                    textViewMed2.setText(obj.getString("address"));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
            }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}

