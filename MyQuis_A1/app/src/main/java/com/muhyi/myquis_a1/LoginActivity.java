package com.muhyi.myquis_a1;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
     TextView tvUsername;
     TextView tvPassword;
     EditText edtUsername;
     EditText edtPassword;
     Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvUsername = findViewById(R.id.tv_username);
        tvPassword = findViewById(R.id.tv_password);
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = edtUsername.getText().toString();
                String passwordKey = edtPassword.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("admin123")){
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class );
                    LoginActivity.this.startActivity(intent);
                    finish();
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                            builder.setMessage("Username atau password Anda Salah !!")
                                    .setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }

}
