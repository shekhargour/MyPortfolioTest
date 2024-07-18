package com.example.myportfoilio;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private TextView warningTextView;

    // In-memory credentials
    private static final String VALID_EMAIL = "shekhar";
    private static final String VALID_PASSWORD = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        warningTextView = findViewById(R.id.warningTextView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (email.equals(VALID_EMAIL) && password.equals(VALID_PASSWORD)) {
                    // Successful login
                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    startActivity(intent);
                    finish(); // Close the login activity
                } else {
                    // Invalid credentials
                    warningTextView.setVisibility(View.VISIBLE);
                    warningTextView.setText("Incorrect email/password");
                }
            }
        });
    }
}