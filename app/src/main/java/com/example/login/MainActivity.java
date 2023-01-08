package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        login= findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String us=username.getText().toString();
                String pas= password.getText().toString();

                Toast.makeText(getApplicationContext(),"login successful.\n username:" +us +"\npassword :"+pas,Toast.LENGTH_LONG).show();
            }
        });
    }
}