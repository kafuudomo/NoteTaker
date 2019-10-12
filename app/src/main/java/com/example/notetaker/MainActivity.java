package com.example.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtUsername,edtPassword;
    private Button btnLogin;
    private String username="Jerry", password="oof";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViews();
        setListeners();


    }

    private void findViews(){
        edtUsername=findViewById(R.id.edt_username);
        edtPassword=findViewById(R.id.edt_password);
        btnLogin=findViewById(R.id.btn_login);

    }

    private void setListeners(){

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername = edtUsername.getText().toString();
                String inputPassword = edtPassword.getText().toString();

            if (inputUsername.equals(username) && inputPassword.equals(password)){


                Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                activityHome();
                finish();

            }else{


                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }

            }
        });


    }

    private void activityHome(){

        Intent i=new Intent(this, ActivityHome.class);
        startActivity(i);


    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
