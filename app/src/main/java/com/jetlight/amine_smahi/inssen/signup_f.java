package com.jetlight.amine_smahi.inssen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup_f extends AppCompatActivity {
    EditText txtname, txtemail, txtphone;
    Button btnsave;
    DatabaseReference reff;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname = (EditText)findViewById(R.id.txtname_signup);
        txtemail = (EditText)findViewById(R.id.txtemail_signup);
        txtphone = (EditText)findViewById(R.id.phone_signup);
        btnsave = (Button)findViewById(R.id.btnSave);
        member = new Member();
        reff = FirebaseDatabase.getInstance().getReference().child("Member");

        Toast.makeText(this, "Firebase connected successfully", Toast.LENGTH_SHORT).show();

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Long phonea = Long.parseLong(txtphone.getText().toString().trim());
                member.setName(txtname.getText().toString().trim());
                member.setEmail(txtemail.getText().toString().trim());
                member.setPhone(phonea);

                reff.push().setValue(member);
                Toast.makeText(signup_f.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
