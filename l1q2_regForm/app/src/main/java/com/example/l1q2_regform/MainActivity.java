package com.example.l1q2_regform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email, phone, password;
    Button submit;
    String v_email = "test@gmail.com", v_phone = "999999999";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.et_email);
        phone = findViewById(R.id.et_phone);
        password = findViewById(R.id.et_password);
        submit = findViewById((R.id.button));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strEmail = email.getText().toString();
                String strPhone = phone.getText().toString();
                String strPassword = password.getText().toString();

                if(strEmail.compareTo(v_email)==0 && strPhone.compareTo(v_phone)==0){
                    Toast.makeText(MainActivity.this, strEmail+" Succesful registration!!", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(MainActivity.this, "Incorrect Credentials!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}