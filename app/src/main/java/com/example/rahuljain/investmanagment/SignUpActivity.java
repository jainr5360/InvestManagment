package com.example.rahuljain.investmanagment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    AutoCompleteTextView atName, atEmail, atNumber, atPassword;
    Button submit;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        atName = (AutoCompleteTextView) findViewById(R.id.at_name);
        atEmail = (AutoCompleteTextView) findViewById(R.id.at_email);
        atNumber = (AutoCompleteTextView) findViewById(R.id.at_numbar);
        atPassword = (AutoCompleteTextView) findViewById(R.id.at_password);
        submit = (Button) findViewById(R.id.btnsubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = atName.getText().toString();
                String email = atEmail.getText().toString();
                String number = atNumber.getText().toString();
                String password = atPassword.getText().toString();
            }

        });

    }
}
