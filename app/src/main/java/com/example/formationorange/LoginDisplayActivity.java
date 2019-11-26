package com.example.formationorange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class LoginDisplayActivity extends AppCompatActivity {
    final String EXTRA_LOGIN ="user_login";
    final String EXTRA_PASSWORD="user_password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_display);

       Intent intent= getIntent();
        TextView loginDisplay=findViewById(R.id.reemail);
        TextView passwordDisplay = findViewById(R.id.repa);

        if(intent !=null){
            loginDisplay.setText(intent.getStringExtra(EXTRA_LOGIN));
            passwordDisplay.setText(intent.getStringExtra(EXTRA_PASSWORD));
        }

    }
}
