package com.example.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityHome extends AppCompatActivity {
    private Button btnAN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnAN=findViewById(R.id.btnAddNote);

        btnAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actAddNote();
            }
        });


    }

    private void actAddNote() {

        Intent i = new Intent(this, AddNoteAct.class);
        startActivity(i);
    }
}
