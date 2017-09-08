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
    private TextView tvForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
        btnRegisterPage.setOnClickListener(this);
        btnLoginPage.setOnClickListener(this);
        tvForgotPassword.setOnClickListener(this);
    }

    private void initInstances() {
        btnRegisterPage = (Button) findViewById(R.id.btnRegisterPage);
        btnLoginPage = (Button) findViewById(R.id.btnLoginPage);
        tvForgotPassword = (TextView) findViewById(R.id.tvForgotPassword);
    }

    @Override
    public void onClick(View view) {
        if (view == btnRegisterPage) {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        } else if (view == btnLoginPage) {
            Intent intent = new Intent(MainActivity.this, MarketListActivity.class);
            startActivity(intent);
        } else if (view == tvForgotPassword) {
            Intent intent = new Intent(MainActivity.this, ForgotPasswordActivity.class);
            startActivity(intent);
        }
    }
}
