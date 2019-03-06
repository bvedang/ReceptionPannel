package com.example.vedan.receptionpannel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class PharmacistFragment extends Fragment {

    TextView textViewMed1, textViewMed2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pharmacist, container, false);
        Button btnscanqr = view.findViewById(R.id.scanButton);
        final IntentIntegrator qrscan = new IntentIntegrator(getActivity());
        textViewMed1 = view.findViewById(R.id.textView10);
        textViewMed2 = view.findViewById(R.id.textView13);

        btnscanqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qrscan.initiateScan();
            }
        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
            if (result != null) {
                if (result.getContents() == null) {
                    Toast.makeText(getActivity(), "Result Not Found", Toast.LENGTH_LONG).show();
                } else {
                    try {
                        JSONObject obj = new JSONObject(result.getContents());
                        textViewMed1.setText(obj.getString("name"));
                        textViewMed2.setText(obj.getString("address"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                        Toast.makeText(getActivity(), result.getContents(), Toast.LENGTH_LONG).show();
                    }
                }
            } else {
                super.onActivityResult(requestCode, resultCode, data);
            }
        }
    }