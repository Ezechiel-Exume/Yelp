package com.example.key_pc.yelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText Email;
    EditText Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    Email = findViewById(R.id.edt_Email);
    Password = findViewById(R.id.edt_password);
    Login = findViewById(R.id.btn_Login);

    Login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(LoginActivity.this, "Bienvenue " + Email.getText().toString()+"\nVotre mot de passe de connextion: " + Password.getText().toString(), Toast.LENGTH_SHORT).show();

        }
    });
    }

}
