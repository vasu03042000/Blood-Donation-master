package com.jetlight.amine_smahi.inssen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_login);
        super.onCreate(savedInstanceState);
        button = (Button)findViewById(R.id.submit_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToSignUp();
            }
        });
    }

    public void GoToDonnors(View view) {
        Intent intent = new Intent(LoginActivity.this,DonnorActivity.class);
        startActivity(intent);
    }

    public void GoToSignUp() {
        Intent intent = new Intent(LoginActivity.this,signup_f.class);
        startActivity(intent);
    }
}
