package com.example.formationorange;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    final String EXTRA_LOGIN = "user_login";
    final String EXTRA_PASSWORD = "user_password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText login = findViewById(R.id.textView);
        final EditText pass = findViewById(R.id.textView2);
        final Button loginButton = findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String loginTxt = login.getText().toString();
                final String passTxt = pass.getText().toString();


                Intent intent = new Intent(MainActivity.this,
                        LoginDisplayActivity.class);
                intent.putExtra(EXTRA_LOGIN, loginTxt);
                intent.putExtra(EXTRA_PASSWORD, passTxt);
                startActivity(intent);

            }
        });
    }
}

