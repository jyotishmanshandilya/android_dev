package com.example.lab2q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text;
    Button enc_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.editTextText);
        enc_btn = (Button) findViewById(R.id.button);

        enc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputStr = text.getText().toString();
                int shift = 3; // You can change the shift value as needed
                String encryptedStr = encryptString(inputStr, shift);
                Toast.makeText(MainActivity.this, "Encrypted value: "+encryptedStr, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String encryptString(String input, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                char encryptedChar = (char) (currentChar + shift);
                if ((Character.isLowerCase(currentChar) && encryptedChar > 'z')
                        || (Character.isUpperCase(currentChar) && encryptedChar > 'Z')) {
                    encryptedChar = (char) (currentChar - (26 - shift));
                }
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(currentChar);
            }
        }
        return encryptedText.toString();
    }
}