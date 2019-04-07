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

public class PatientFragment extends Fragment {

    Button newpatient,oldpatient;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.patient_fragment,container,false);
        newpatient = view.findViewById(R.id.newPatient);
        oldpatient = view.findViewById(R.id.oldPatient);
        final Intent NewPatientpage = new Intent(getActivity(), NewPatientActivity.class);
        final Intent OldPatientpage = new Intent(getActivity(), OldPatientActivity.class);
        newpatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(NewPatientpage);
            }
        });
        oldpatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(OldPatientpage);
            }
        });
        return view;
    }


}
