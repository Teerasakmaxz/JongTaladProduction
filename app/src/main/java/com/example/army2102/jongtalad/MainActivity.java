package com.example.army2102.jongtalad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRegisterPage;
    private Button btnLoginPage;
    private TextView tvForgotPassword ,textView3,textView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
        btnRegisterPage.setOnClickListener(this);
        btnLoginPage.setOnClickListener(this);
        tvForgotPassword.setOnClickListener(this);
//        textView3.setOnClickListener(this);
//        textView4.setOnClickListener(this);
    }

    private void initInstances() {
        btnRegisterPage = (Button) findViewById(R.id.btnRegisterPage);
        btnLoginPage = (Button) findViewById(R.id.btnLoginPage);
        tvForgotPassword = (TextView) findViewById(R.id.tvForgotPassword);
//        textView3 = (TextView) findViewById(R.id.textView3);
//        textView4 = (TextView) findViewById(R.id.textView4);

    }

    @Override
    public void onClick(View view) {
        if (view == btnLoginPage) {
            Intent intent = new Intent(getApplicationContext(), LockReservation.class);
            startActivity(intent);
        } else if (view == btnRegisterPage) {
            Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
            startActivity(intent);
        } else if (view == tvForgotPassword) {
            Intent intent = new Intent(MainActivity.this, ForgotPasswordActivity.class);
            startActivity(intent);
        }
    }
}
