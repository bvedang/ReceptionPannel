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
import android.widget.EditText;
import android.widget.Toast;

public class ReceptionFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_reception, container, false);
        final EditText userid = view.findViewById(R.id.userIDText);
        final EditText password = view.findViewById(R.id.passwordText);
        Button btn1 = view.findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((userid.getText().toString().equals("vedang")) && (password.getText().toString().equals("barhate"))) {
                    Toast.makeText(getActivity(), "hello", Toast.LENGTH_LONG).show();
                    Intent secondactivity = new Intent(getActivity(), SecondActivity.class);
                    startActivity(secondactivity);
                } else {
                    Toast.makeText(getActivity(), "The details you have Entered are incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}
