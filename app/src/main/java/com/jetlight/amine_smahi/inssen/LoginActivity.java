package com.jetlight.amine_smahi.inssen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private EditText user_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_login);
        super.onCreate(savedInstanceState);
        button = (Button)findViewById(R.id.submit_btn);
        button2 = (Button)findViewById(R.id.login_btn);
        user_email = (EditText)findViewById(R.id.user_email);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToSignUp();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = user_email.getText().toString().trim();

                if(TextUtils.isEmpty(email))
                {
                    Toast.makeText(LoginActivity.this, "Please enter a valid email id", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Toast.makeText(LoginActivity.this,"Logged in successfully", Toast.LENGTH_LONG).show();
                    GoToDonnors();
                }
            }
        });
    }

    public void GoToDonnors() {
        Intent intent = new Intent(LoginActivity.this,DonnorActivity.class);
        startActivity(intent);
    }

    public void GoToSignUp() {
        Intent intent = new Intent(LoginActivity.this,signup_f.class);
        startActivity(intent);
    }
}
